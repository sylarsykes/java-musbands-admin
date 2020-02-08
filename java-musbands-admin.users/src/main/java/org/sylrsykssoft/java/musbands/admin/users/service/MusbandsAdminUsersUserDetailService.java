package org.sylrsykssoft.java.musbands.admin.users.service;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.SERVICE_NAME;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.library.mapper.IMapperFunction;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.security.service.IBaseUserUserDetailsService;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;
import org.sylrsykssoft.java.musbands.admin.users.repository.MusbandsAdminUsersRepository;
import org.sylrsykssoft.java.musbands.admin.users.resource.MusbandsAdminUserResource;
import org.sylrsykssoft.java.musbands.admin.users.resource.assembler.MusbandsAdminUserResourceAssembler;

/**
 * MusbandsAdminUsersUserDetailService
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Service(SERVICE_NAME)
public class MusbandsAdminUsersUserDetailService
implements IBaseUserUserDetailsService<MusbandsAdminUser, MusbandsAdminUserResource, Long>,
IMapperFunction<MusbandsAdminUser, MusbandsAdminUserResource> {

	@Autowired
	private MusbandsAdminUsersRepository userRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_RESOURCE_ASSEMBLER)
	private MusbandsAdminUserResourceAssembler musbandsAdminUserMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_ENTITY_FUNCTION)
	private ModelMapperFunction<MusbandsAdminUserResource, MusbandsAdminUser> musbandsAdminUserMapperToEntity;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<MusbandsAdminUserResource> findAll() {
		final List<MusbandsAdminUser> musbandAdminUsers = getUserRepository().findAll();

		return musbandAdminUsers.stream().map(mapperToResource()::toResource).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	public MusbandsAdminUsersRepository getUserRepository() {
		return userRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<MusbandsAdminUserResource> loadByName(final String name) throws UsernameNotFoundException {
		final Collection<MusbandsAdminUser> musbandsAdminUsers = getUserRepository().findByName(name);

		if (musbandsAdminUsers.isEmpty())
			throw new UsernameNotFoundException(name);

		return musbandsAdminUsers.stream().map(mapperToResource()::toResource).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		final MusbandsAdminUser musbandsAdminUser = getUserRepository().findByUsername(username);

		if (musbandsAdminUser == null)
			throw new UsernameNotFoundException(username);

		return mapperToResource().toResource(musbandsAdminUser);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(final String username, final boolean enabled)
			throws UsernameNotFoundException {
		final MusbandsAdminUser musbandsAdminUser = getUserRepository().findByUsernameAndEnabled(username, enabled);

		if (musbandsAdminUser == null)
			throw new UsernameNotFoundException(username);

		return mapperToResource().toResource(musbandsAdminUser);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusbandsAdminUserResource, MusbandsAdminUser> mapperToEntity() {
		return musbandsAdminUserMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<MusbandsAdminUser, MusbandsAdminUserResource> mapperToResource() {
		return musbandsAdminUserMapperToResource;
	}

}
