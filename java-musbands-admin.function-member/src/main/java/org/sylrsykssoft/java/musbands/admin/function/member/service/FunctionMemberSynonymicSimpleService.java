package org.sylrsykssoft.java.musbands.admin.function.member.service;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CACHE_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.SERVICE_SIMPLE_NAME;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminSimpleRepository;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.service.BaseAdminSimpleService;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.repository.FunctionMemberSynonymicSimpleRepository;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicSimpleResource;

/**
 * FunctionMemberSimpleService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_SIMPLE_NAME)
@CacheConfig(cacheNames = CACHE_NAME, cacheManager = CACHE_MANGER_BEAN_NAME)
public class FunctionMemberSynonymicSimpleService
		extends BaseAdminSimpleService<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> {

	@Autowired
	private FunctionMemberSynonymicSimpleRepository functionMemberRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	private ResourceAssemblerSupport<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> functionMemberMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_ENTITY_FUNCTION)
	private ModelMapperFunction<FunctionMemberSynonymicSimpleResource, FunctionMemberSynonymicSimple> functionMemberMapperToEntity;

	/**
	 * Find all function members
	 * 
	 * Refresh all the entries in the cache to load new ones
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public List<FunctionMemberSynonymicSimpleResource> findAll() {
		return super.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public Optional<FunctionMemberSynonymicSimpleResource> findByName(final String name)
			throws NotFoundEntityException {
		return super.findByName(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleRepository<FunctionMemberSynonymicSimple> getAdminRepository() {
		return functionMemberRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberSynonymicSimpleResource, FunctionMemberSynonymicSimple> mapperToEntity() {
		return functionMemberMapperToEntity;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> mapperToResource() {
		return functionMemberMapperToResource;
	}

}