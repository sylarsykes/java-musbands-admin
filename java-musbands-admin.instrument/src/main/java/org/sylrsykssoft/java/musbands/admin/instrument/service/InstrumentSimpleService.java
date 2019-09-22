package org.sylrsykssoft.java.musbands.admin.instrument.service;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CACHE_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.SERVICE_SIMPLE_NAME;

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
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.repository.InstrumentSimpleRepository;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentSimpleResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentSimpleResourceAssembler;

/**
 * InstrumentService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_SIMPLE_NAME)
@CacheConfig(cacheNames = CACHE_NAME, cacheManager = CACHE_MANGER_BEAN_NAME)
public class InstrumentSimpleService extends BaseAdminSimpleService<Instrument, InstrumentSimpleResource> {

	@Autowired
	private InstrumentSimpleRepository instrumentRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	private InstrumentSimpleResourceAssembler instrumentMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_ENTITY_FUNCTION)
	private ModelMapperFunction<InstrumentSimpleResource, Instrument> instrumentMapperToEntity;

	/**
	 * Find all musical genres
	 * 
	 * Refresh all the entries in the cache to load new ones
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public List<InstrumentSimpleResource> findAll() {
		return super.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public Optional<InstrumentSimpleResource> findByName(final String name) throws NotFoundEntityException {
		return super.findByName(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleRepository<Instrument> getAdminRepository() {
		return instrumentRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<InstrumentSimpleResource, Instrument> mapperToEntity() {
		return instrumentMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<Instrument, InstrumentSimpleResource> mapperToResource() {
		return instrumentMapperToResource;
	}

}