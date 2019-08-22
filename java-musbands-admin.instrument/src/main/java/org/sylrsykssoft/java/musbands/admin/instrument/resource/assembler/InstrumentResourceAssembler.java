package org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;

/**
 * The Class InstrumentResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class InstrumentResourceAssembler
		extends BaseAdminResourceAssembler<InstrumentController, Instrument, InstrumentResource> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_RESOURCE_FUNCTION)
	private ModelMapperFunction<Instrument, InstrumentResource> instrumentMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public InstrumentResourceAssembler(final Class<InstrumentController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentResource> resourceType) {
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
	public InstrumentResourceAssembler(final Class<InstrumentController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<Instrument, InstrumentResource> getAdminMapperToResourceFunction() {
		return instrumentMapperToResourceFunction;
	}

}
