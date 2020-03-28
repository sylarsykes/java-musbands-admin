package org.sylrsykssoft.java.musbands.admin.users.configuration;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.MAPPER_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.users.controller.MusbandsAdminUserController;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;
import org.sylrsykssoft.java.musbands.admin.users.resource.MusbandsAdminUserResource;
import org.sylrsykssoft.java.musbands.admin.users.resource.assembler.MusbandsAdminUserResourceAssembler;

/**
 * MusbandsAdminUserMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class MusbandsAdminUserMapperConfiguration {

	/**
	 * MusbandsAdminUser mapper to entity function.
	 *
	 * @return ModelMapperFunction<MusbandsAdminUserResource, MusbandsAdminUser> the
	 *         model mapper function
	 */
	@Bean(MAPPER_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<MusbandsAdminUserResource, MusbandsAdminUser> musbandsAdminUserMapperToEntityFunction() {
		return new ModelMapperFunction<>(MusbandsAdminUserResource.class, MusbandsAdminUser.class);
	}

	/**
	 * MusbandsAdminUser mapper to resource function.
	 *
	 * @return ModelMapperFunction<MusbandsAdminUser, MusbandsAdminUserResource> the
	 *         model mapper function
	 */
	@Bean(MAPPER_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<MusbandsAdminUser, MusbandsAdminUserResource> musbandsAdminUserMapperToResourceFunction() {
		return new ModelMapperFunction<>(MusbandsAdminUser.class, MusbandsAdminUserResource.class);
	}

	/**
	 * MusbandsAdminUser resource assembler
	 *
	 * @return MusbandsAdminUserResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public MusbandsAdminUserResourceAssembler musbandsAdminUserResourceAssembler() {
		return new MusbandsAdminUserResourceAssembler(MusbandsAdminUserController.class, MusbandsAdminUser.class,
				MusbandsAdminUserResource.class);
	}

}
