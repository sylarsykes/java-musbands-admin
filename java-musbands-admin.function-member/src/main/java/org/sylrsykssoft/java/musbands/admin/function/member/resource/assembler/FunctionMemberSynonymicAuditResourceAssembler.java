package org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.audit.resource.assembler.BaseAdminSimpleAuditResourceAssembler;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSynonymicAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicAuditResource;

/**
 * The Class FunctionMemberSynonymicSimpleResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class FunctionMemberSynonymicAuditResourceAssembler extends
BaseAdminSimpleAuditResourceAssembler<FunctionMemberSynonymicAuditController, FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> {


	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_FUNCTION)
	private ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> functionMemberSynonymicMapperToResource;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public FunctionMemberSynonymicAuditResourceAssembler(
			final Class<FunctionMemberSynonymicAuditController> controllerClass,
			final Class<FunctionMemberSynonymicSimple> entityClass,
			final Class<FunctionMemberSynonymicAuditResource> resourceType) {
		super(controllerClass, entityClass, resourceType);
	}

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType the resource type
	 * @param parameters the parameters
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType", "parameters" })
	public FunctionMemberSynonymicAuditResourceAssembler(
			final Class<FunctionMemberSynonymicAuditController> controllerClass,
			final Class<FunctionMemberSynonymicSimple> entityClass,
			final Class<FunctionMemberSynonymicAuditResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> getAdminMapperToResourceFunction() {
		return functionMemberSynonymicMapperToResource;
	}

}
