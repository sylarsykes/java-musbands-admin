package org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.web.resource.assembler.BaseAdminSimpleResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSynonymicSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicSimpleResource;

/**
 * The Class FunctionMemberSimpleResourceAssembler.
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class FunctionMemberSynonymicSimpleResourceAssembler extends
		BaseAdminSimpleResourceAssembler<FunctionMemberSynonymicSimpleController, FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> {


	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	private ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> functionMemberSynonymicMapperToResource;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public FunctionMemberSynonymicSimpleResourceAssembler(
			final Class<FunctionMemberSynonymicSimpleController> controllerClass,
			final Class<FunctionMemberSynonymicSimple> entityClass,
			final Class<FunctionMemberSynonymicSimpleResource> resourceType) {
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
	public FunctionMemberSynonymicSimpleResourceAssembler(
			final Class<FunctionMemberSynonymicSimpleController> controllerClass,
			final Class<FunctionMemberSynonymicSimple> entityClass,
			final Class<FunctionMemberSynonymicSimpleResource> resourceType, final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> getAdminMapperToResourceFunction() {
		return functionMemberSynonymicMapperToResource;
	}

}
