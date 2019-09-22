package org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminSimpleResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.musical.genre.controller.MusicalGenreSimpleController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreSimpleResource;

/**
 * MusicalGenreSimpleResourceAssembler
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class MusicalGenreSimpleResourceAssembler
		extends
		BaseAdminSimpleResourceAssembler<MusicalGenreSimpleController, MusicalGenre, MusicalGenreSimpleResource> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	private ModelMapperFunction<MusicalGenre, MusicalGenreSimpleResource> musicalGenreMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public MusicalGenreSimpleResourceAssembler(final Class<MusicalGenreSimpleController> controllerClass,
			final Class<MusicalGenre> entityClass, final Class<MusicalGenreSimpleResource> resourceType) {
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
	public MusicalGenreSimpleResourceAssembler(final Class<MusicalGenreSimpleController> controllerClass,
			final Class<MusicalGenre> entityClass, final Class<MusicalGenreSimpleResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusicalGenre, MusicalGenreSimpleResource> getAdminMapperToResourceFunction() {
		return musicalGenreMapperToResourceFunction;
	}

}
