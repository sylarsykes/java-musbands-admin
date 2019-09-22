package org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminSimpleResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSimpleResource;

/**
 * The Class FunctionMemberSimpleResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class FunctionMemberSimpleResourceAssembler extends
		BaseAdminSimpleResourceAssembler<FunctionMemberSimpleController, FunctionMember, FunctionMemberSimpleResource> {


	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	private ModelMapperFunction<FunctionMember, FunctionMemberSimpleResource> functionMemberMapperToResource;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public FunctionMemberSimpleResourceAssembler(final Class<FunctionMemberSimpleController> controllerClass, final Class<FunctionMember> entityClass, final Class<FunctionMemberSimpleResource> resourceType) {
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
	public FunctionMemberSimpleResourceAssembler(final Class<FunctionMemberSimpleController> controllerClass, final Class<FunctionMember> entityClass, final Class<FunctionMemberSimpleResource> resourceType, final Object ...parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMember, FunctionMemberSimpleResource> getAdminMapperToResourceFunction() {
		return functionMemberMapperToResource;
	}

}
