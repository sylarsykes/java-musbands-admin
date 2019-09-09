package org.sylrsykssoft.java.musbands.admin.musical.genre.service;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.SERVICE_AUDIT_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.audit.service.BaseAdminAuditService;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.repository.MusicalGenreRepository;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreAuditResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler.MusicalGenreAuditResourceAssembler;

/**
 * MusicalGenreService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_AUDIT_NAME)
public class MusicalGenreAuditService extends BaseAdminAuditService<MusicalGenre, MusicalGenreAuditResource> {

	@Autowired
	private MusicalGenreRepository musicalGenreRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	private MusicalGenreAuditResourceAssembler musicalGenreMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_ENTITY_FUNCTION)
	private ModelMapperFunction<MusicalGenreAuditResource, MusicalGenre> musicalGenreAuditMapperToEntity;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusicalGenreRepository getAdminRepository() {
		return musicalGenreRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusicalGenreAuditResource, MusicalGenre> mapperToEntity() {
		return musicalGenreAuditMapperToEntity;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<MusicalGenre, MusicalGenreAuditResource> mapperToResource() {
		return musicalGenreMapperToResource;
	}

}