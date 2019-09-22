package org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.audit.resource.assembler.BaseAdminAuditResourceAssembler;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberAuditResource;

/**
 * The Class FunctionMemberSimpleResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class FunctionMemberAuditResourceAssembler extends
BaseAdminAuditResourceAssembler<FunctionMemberAuditController, FunctionMember, FunctionMemberAuditResource> {


	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_FUNCTION)
	private ModelMapperFunction<FunctionMember, FunctionMemberAuditResource> functionMemberMapperToResource;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public FunctionMemberAuditResourceAssembler(final Class<FunctionMemberAuditController> controllerClass,
			final Class<FunctionMember> entityClass, final Class<FunctionMemberAuditResource> resourceType) {
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
	public FunctionMemberAuditResourceAssembler(final Class<FunctionMemberAuditController> controllerClass,
			final Class<FunctionMember> entityClass, final Class<FunctionMemberAuditResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMember, FunctionMemberAuditResource> getAdminMapperToResourceFunction() {
		return functionMemberMapperToResource;
	}

}
