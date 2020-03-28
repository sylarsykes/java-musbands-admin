package org.sylrsykssoft.java.musbands.admin.users.service;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.SERVICE_NAME;

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
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil.LogMessageLevel;
import org.sylrsykssoft.coreapi.framework.security.service.IBaseUserUserDetailsService;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;
import org.sylrsykssoft.java.musbands.admin.users.repository.MusbandsAdminUserRepository;
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
	private MusbandsAdminUserRepository userRepository;

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

		LoggerUtil.message(LogMessageLevel.INFO, "MusbandsAdminUsersUserDetailService::findAll Found {} entries.",
				musbandAdminUsers);

		return musbandAdminUsers.stream().map(mapperToResource()::toResource).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	public MusbandsAdminUserRepository getUserRepository() {
		return userRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<MusbandsAdminUserResource> loadByName(final String name) throws UsernameNotFoundException {
		final Collection<MusbandsAdminUser> musbandsAdminUsers = getUserRepository().findByName(name);

		LoggerUtil.message(LogMessageLevel.INFO, "MusbandsAdminUsersUserDetailService::loadByName Found {} entries.",
				musbandsAdminUsers);

		if (musbandsAdminUsers.isEmpty()) {
			LoggerUtil.message(LogMessageLevel.WARN,
					"MusbandsAdminUsersUserDetailService::loadByName Not found users.");
			throw new UsernameNotFoundException(name);
		}

		return musbandsAdminUsers.stream().map(mapperToResource()::toResource).collect(Collectors.toList());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		LoggerUtil.message(LogMessageLevel.WARN,
				"MusbandsAdminUsersUserDetailService::loadUserByUsername Find user with username {}.", username);

		final MusbandsAdminUser musbandsAdminUser = getUserRepository().findByUsername(username);

		LoggerUtil.message(LogMessageLevel.INFO,
				"MusbandsAdminUsersUserDetailService::loadUserByUsername Found {} entry.", musbandsAdminUser);

		if (musbandsAdminUser == null) {
			LoggerUtil.message(LogMessageLevel.WARN,
					"MusbandsAdminUsersUserDetailService::loadUserByUsername Not found user with username {}.",
					username);
			throw new UsernameNotFoundException(username);
		}

		return mapperToResource().toResource(musbandsAdminUser);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetails loadUserByUsername(final String username, final boolean enabled)
			throws UsernameNotFoundException {
		LoggerUtil.message(LogMessageLevel.WARN,
				"MusbandsAdminUsersUserDetailService::loadUserByUsername Find user with username {} and enabled {}.",
				username, enabled);

		final MusbandsAdminUser musbandsAdminUser = getUserRepository().findByUsernameAndEnabled(username, enabled);

		LoggerUtil.message(LogMessageLevel.INFO,
				"MusbandsAdminUsersUserDetailService::loadUserByUsername Found {} entry.", musbandsAdminUser);

		if (musbandsAdminUser == null) {
			LoggerUtil.message(LogMessageLevel.WARN,
					"MusbandsAdminUsersUserDetailService::loadUserByUsername Not found user with username {}.",
					username);
			throw new UsernameNotFoundException(username);
		}

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
