package org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.audit.resource.assembler.BaseAdminAuditResourceAssembler;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentAuditController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentAuditResource;

/**
 * The Class BaseResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class InstrumentAuditResourceAssembler
		extends BaseAdminAuditResourceAssembler<InstrumentAuditController, Instrument, InstrumentAuditResource> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_FUNCTION)
	private ModelMapperFunction<Instrument, InstrumentAuditResource> instrumentAuditMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public InstrumentAuditResourceAssembler(final Class<InstrumentAuditController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentAuditResource> resourceType) {
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
	public InstrumentAuditResourceAssembler(final Class<InstrumentAuditController> controllerClass,
			final Class<Instrument> entityClass, final Class<InstrumentAuditResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<Instrument, InstrumentAuditResource> getAdminMapperToResourceFunction() {
		return instrumentAuditMapperToResourceFunction;
	}

}
