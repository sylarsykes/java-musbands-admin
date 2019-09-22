package org.sylrsykssoft.java.musbands.admin.function.member.configuration;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberController;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler.FunctionMemberAuditResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler.FunctionMemberResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler.FunctionMemberSimpleResourceAssembler;

/**
 * FunctionMemberMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class FunctionMemberMapperConfiguration {

	/**
	 * FunctionMemberAudit mapper to entity function.
	 *
	 * @return ModelMapperFunction<FunctionMemberAuditResource, FunctionMember> the
	 *         model mapper function
	 */
	@Bean(MAPPER_AUDIT_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberAuditResource, FunctionMember> functionMemberAuditMapperToEntityFunction() {
		return new ModelMapperFunction<>(FunctionMemberAuditResource.class, FunctionMember.class);
	}

	/**
	 * FunctionMemberAudit mapper to resource function.
	 *
	 * @return ModelMapperFunction<FunctionMember, FunctionMemberAuditResource> the
	 *         model mapper function
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMember, FunctionMemberAuditResource> functionMemberAuditMapperToResourceFunction() {
		return new ModelMapperFunction<>(FunctionMember.class,
				FunctionMemberAuditResource.class);
	}

	/**
	 * FunctionMemberAudit resource assembler
	 *
	 * @return FunctionMemberAuditResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public FunctionMemberAuditResourceAssembler functionMemberAuditResourceAssembler() {
		return new FunctionMemberAuditResourceAssembler(FunctionMemberAuditController.class, FunctionMember.class,
				FunctionMemberAuditResource.class);
	}

	/**
	 * FunctionMember mapper function.
	 *
	 * @return the model mapper function
	 */
	@Bean(FunctionMemberConstants.MAPPER_ENTITY_FUNCTION)
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberResource, FunctionMember> functionMemberMapperToEntityFunction() {
		return new ModelMapperFunction<>(FunctionMemberResource.class, FunctionMember.class);
	}

	/**
	 * FunctionMember mapper function.
	 *
	 * @return the model mapper function
	 */
	@Bean(FunctionMemberConstants.MAPPER_RESOURCE_FUNCTION)
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMember, FunctionMemberResource> functionMemberMapperToResourceFunction() {
		return new ModelMapperFunction<>(FunctionMember.class,
				FunctionMemberResource.class);
	}

	/**
	 * FunctionMember mapper function.
	 *
	 * @return the model mapper function
	 */
	@Bean(FunctionMemberConstants.MAPPER_RESOURCE_ASSEMBLER)
	@Lazy(value = true)
	public FunctionMemberResourceAssembler functionMemberResourceAssembler() {
		return new FunctionMemberResourceAssembler(FunctionMemberController.class, FunctionMember.class,
				FunctionMemberResource.class);
	}

	/**
	 * FunctionMemberSimple mapper to entity function.
	 *
	 * @return ModelMapperFunction<FunctionMemberSimpleResource, FunctionMember> the
	 *         model mapper function
	 */
	@Bean(MAPPER_SIMPLE_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberSimpleResource, FunctionMember> functionMemberSimpleMapperToEntityFunction() {
		return new ModelMapperFunction<>(FunctionMemberSimpleResource.class, FunctionMember.class);
	}

	/**
	 * FunctionMemberSimple mapper to resource function.
	 *
	 * @return ModelMapperFunction<FunctionMember, FunctionMemberSimpleResource> the
	 *         model mapper function
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMember, FunctionMemberSimpleResource> functionMemberSimpleMapperToResourceFunction() {
		return new ModelMapperFunction<>(FunctionMember.class, FunctionMemberSimpleResource.class);
	}

	/**
	 * FunctionMemberSimple resource assembler
	 *
	 * @return FunctionMemberSimpleResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public FunctionMemberSimpleResourceAssembler functionMemberSimpleResourceAssembler() {
		return new FunctionMemberSimpleResourceAssembler(FunctionMemberSimpleController.class, FunctionMember.class,
				FunctionMemberSimpleResource.class);
	}

}
