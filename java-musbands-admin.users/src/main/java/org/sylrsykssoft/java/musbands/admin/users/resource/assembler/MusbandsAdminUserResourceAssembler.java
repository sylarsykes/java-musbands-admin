package org.sylrsykssoft.java.musbands.admin.users.resource.assembler;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_RESOURCE_FUNCTION;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.coreapi.framework.security.resource.assembler.BaseUserResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.users.controller.MusbandsAdminUserController;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;
import org.sylrsykssoft.java.musbands.admin.users.resource.MusbandsAdminUserResource;

/**
 * MusbandsAdminUserResourceAssembler
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class MusbandsAdminUserResourceAssembler
		extends
		BaseUserResourceAssembler<MusbandsAdminUserController, MusbandsAdminUser, MusbandsAdminUserResource, Long> {

	/** The base entity resource model mapper function. */
	@Autowired
	@Qualifier(MAPPER_RESOURCE_FUNCTION)
	private ModelMapperFunction<MusbandsAdminUser, MusbandsAdminUserResource> musbandsAdminUserMapperToResourceFunction;

	/**
	 * Instantiates a new base resource assembler.
	 *
	 * @param controllerClass the controller class
	 * @param resourceType    the resource type
	 */
	@ConstructorProperties({ "controllerClass", "entityClass", "resourceType" })
	public MusbandsAdminUserResourceAssembler(final Class<MusbandsAdminUserController> controllerClass,
			final Class<MusbandsAdminUser> entityClass, final Class<MusbandsAdminUserResource> resourceType) {
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
	public MusbandsAdminUserResourceAssembler(final Class<MusbandsAdminUserController> controllerClass,
			final Class<MusbandsAdminUser> entityClass, final Class<MusbandsAdminUserResource> resourceType,
			final Object... parameters) {
		super(controllerClass, entityClass, resourceType, parameters);
	}

	/**
	 * {inheritDoc}
	 */
	@Override
	public ModelMapperFunction<MusbandsAdminUser, MusbandsAdminUserResource> getUserEntityMapperToResourceFunction() {
		return musbandsAdminUserMapperToResourceFunction;
	}


}
