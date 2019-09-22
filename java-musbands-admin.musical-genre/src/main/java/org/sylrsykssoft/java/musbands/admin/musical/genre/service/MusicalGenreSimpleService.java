package org.sylrsykssoft.java.musbands.admin.musical.genre.service;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CACHE_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.SERVICE_SIMPLE_NAME;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.service.BaseAdminSimpleService;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.repository.MusicalGenreSimpleRepository;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreSimpleResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler.MusicalGenreSimpleResourceAssembler;

/**
 * MusicalGenreSimpleService Service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_SIMPLE_NAME)
@CacheConfig(cacheNames = CACHE_NAME, cacheManager = CACHE_MANGER_BEAN_NAME)
public class MusicalGenreSimpleService extends BaseAdminSimpleService<MusicalGenre, MusicalGenreSimpleResource> {

	@Autowired
	private MusicalGenreSimpleRepository musicalGenreRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	private MusicalGenreSimpleResourceAssembler musicalGenreMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_ENTITY_FUNCTION)
	private ModelMapperFunction<MusicalGenreSimpleResource, MusicalGenre> musicalGenreMapperToEntity;

	/**
	 * Find all musical genres
	 * 
	 * Refresh all the entries in the cache to load new ones
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public List<MusicalGenreSimpleResource> findAll() {
		return super.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Cacheable(value = CACHE_NAME, key = "#root.method", unless = "#result == null")
	public Optional<MusicalGenreSimpleResource> findByName(final String name) throws NotFoundEntityException {
		return super.findByName(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusicalGenreSimpleRepository getAdminRepository() {
		return musicalGenreRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusicalGenreSimpleResource, MusicalGenre> mapperToEntity() {
		return musicalGenreMapperToEntity;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<MusicalGenre, MusicalGenreSimpleResource> mapperToResource() {
		return musicalGenreMapperToResource;
	}

}