package org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.audit.resource.assembler.BaseAdminAuditResourceAssembler;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.musical.genre.controller.MusicalGenreAuditController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreAuditResource;

/**
 * The Class BaseResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class MusicalGenreAuditResourceAssembler
extends BaseAdminAuditResourceAssembler<MusicalGenreAuditController, MusicalGenre, MusicalGenreAuditResource> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_FUNCTION)
	private ModelMapperFunction<MusicalGenre, MusicalGenreAuditResource> musicalGenreMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public MusicalGenreAuditResourceAssembler(final Class<MusicalGenreAuditController> controllerClass,
			final Class<MusicalGenre> entityClass, final Class<MusicalGenreAuditResource> resourceType) {
		super(controllerClass, entityClass, resourceType);
	}

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 * @param parameters      the parameters
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType", "parameters" })
	public MusicalGenreAuditResourceAssembler(final Class<MusicalGenreAuditController> controllerClass,
			final Class<MusicalGenre> entityClass, final Class<MusicalGenreAuditResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusicalGenre, MusicalGenreAuditResource> getAdminMapperToResourceFunction() {
		return musicalGenreMapperToResourceFunction;
	}

}
