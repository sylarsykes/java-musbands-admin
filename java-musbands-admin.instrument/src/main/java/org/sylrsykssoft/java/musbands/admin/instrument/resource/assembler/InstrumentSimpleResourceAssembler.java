package org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminSimpleResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentSimpleController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentSimpleResource;

/**
 * The Class BaseResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class InstrumentSimpleResourceAssembler
extends
BaseAdminSimpleResourceAssembler<InstrumentSimpleController, Instrument, InstrumentSimpleResource> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	private ModelMapperFunction<Instrument, InstrumentSimpleResource> musicalGenreMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public InstrumentSimpleResourceAssembler(final Class<InstrumentSimpleController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentSimpleResource> resourceType) {
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
	public InstrumentSimpleResourceAssembler(final Class<InstrumentSimpleController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentSimpleResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<Instrument, InstrumentSimpleResource> getAdminMapperToResourceFunction() {
		return musicalGenreMapperToResourceFunction;
	}

}
