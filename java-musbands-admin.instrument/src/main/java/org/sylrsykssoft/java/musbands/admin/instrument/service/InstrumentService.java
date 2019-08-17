package org.sylrsykssoft.java.musbands.admin.instrument.service;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CACHE_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.SERVICE_NAME;

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
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.repository.InstrumentRepository;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentResourceAssembler;

/**
 * InstrumentService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_NAME)
@CacheConfig(cacheNames = CACHE_NAME, cacheManager = CACHE_MANGER_BEAN_NAME)
public class InstrumentService extends BaseAdminService<Instrument, InstrumentResource> {

	@Autowired
	private InstrumentRepository instrumentRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_RESOURCE_ASSEMBLER)
	private InstrumentResourceAssembler instrumentMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_ENTITY_FUNCTION)
	private ModelMapperFunction<InstrumentResource, Instrument> instrumentMapperToEntity;

	/**
	 * Find all musical genres
	 * 
	 * Refresh all the entries in the cache to load new ones
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public List<InstrumentResource> findAll() {
		return super.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public Optional<InstrumentResource> findByName(final String name) throws NotFoundEntityException {
		return super.findByName(name);
	}

	/**
	 * {@inheritDoc}
	 */
	public BaseAdminRepository<Instrument> getAdminRepository() {
		return instrumentRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<InstrumentResource, Instrument> mapperToEntity() {
		return instrumentMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<Instrument, InstrumentResource> mapperToResource() {
		return instrumentMapperToResource;
	}

}