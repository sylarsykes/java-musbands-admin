package org.sylrsykssoft.java.musbands.admin.function.member.service;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CACHE_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.SERVICE_NAME;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.service.BaseAdminService;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.repository.FunctionMemberRepository;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;

/**
 * FunctionMemberService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_NAME)
@CacheConfig(cacheNames = CACHE_NAME, cacheManager = CACHE_MANGER_BEAN_NAME)
public class FunctionMemberService extends BaseAdminService<FunctionMember, FunctionMemberResource> {

	@Autowired
	private FunctionMemberRepository functionMemberRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_RESOURCE_ASSEMBLER)
	private ResourceAssemblerSupport<FunctionMember, FunctionMemberResource> functionMemberMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_ENTITY_FUNCTION)
	private ModelMapperFunction<FunctionMemberResource, FunctionMember> functionMemberMapperToEntity;

	/**
	 * Find all function members
	 * 
	 * Refresh all the entries in the cache to load new ones
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public List<FunctionMemberResource> findAll() {
		return super.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public Optional<FunctionMemberResource> findByName(final String name) throws NotFoundEntityException {
		return super.findByName(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminRepository<FunctionMember> getAdminRepository() {
		return functionMemberRepository;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberResource, FunctionMember> mapperToEntity() {
		return functionMemberMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<FunctionMember, FunctionMemberResource> mapperToResource() {
		return functionMemberMapperToResource;
	}

}