package org.sylrsykssoft.java.musbands.admin.function.member.configuration;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSynonymicAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.controller.FunctionMemberSynonymicSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler.FunctionMemberSynonymicAuditResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.assembler.FunctionMemberSynonymicSimpleResourceAssembler;

/**
 * FunctionMemberMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class FunctionMemberSynonymicMapperConfiguration {

	/**
	 * FunctionMemberAudit mapper to entity function.
	 *
	 * @return ModelMapperFunction<FunctionMemberSynonymicAuditResource,
	 *         FunctionMember> the model mapper function
	 */
	@Bean(MAPPER_AUDIT_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberSynonymicAuditResource, FunctionMemberSynonymicSimple> functionMemberSynonymicAuditMapperToEntityFunction() {
		return new ModelMapperFunction<>(FunctionMemberSynonymicAuditResource.class,
				FunctionMemberSynonymicSimple.class);
	}

	/**
	 * FunctionMemberAudit mapper to resource function.
	 *
	 * @return ModelMapperFunction<FunctionMember,
	 *         FunctionMemberSynonymicAuditResource> the model mapper function
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> functionMemberSynonymicAuditMapperToResourceFunction() {
		return new ModelMapperFunction<>(FunctionMemberSynonymicSimple.class,
				FunctionMemberSynonymicAuditResource.class);
	}

	/**
	 * FunctionMemberAudit resource assembler
	 *
	 * @return FunctionMemberSynonymicAuditResourceAssembler the model resource
	 *         assembler
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public FunctionMemberSynonymicAuditResourceAssembler functionMemberSynonymicAuditResourceAssembler() {
		return new FunctionMemberSynonymicAuditResourceAssembler(FunctionMemberSynonymicAuditController.class,
				FunctionMemberSynonymicSimple.class, FunctionMemberSynonymicAuditResource.class);
	}

	/**
	 * FunctionMemberSynonymicSimple mapper to entity function.
	 *
	 * @return ModelMapperFunction<FunctionMemberSynonymicSimpleResource,
	 *         FunctionMemberSynonymic> the model mapper function
	 */
	@Bean(MAPPER_SIMPLE_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberSynonymicSimpleResource, FunctionMemberSynonymicSimple> functionMemberSynonymicSimpleMapperToEntityFunction() {
		return new ModelMapperFunction<>(FunctionMemberSynonymicSimpleResource.class,
				FunctionMemberSynonymicSimple.class);
	}

	/**
	 * FunctionMemberSynonymicSimple mapper to resource function.
	 *
	 * @return ModelMapperFunction<FunctionMemberSynonymic,
	 *         FunctionMemberSynonymicSimpleResource> the model mapper function
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<FunctionMemberSynonymicSimple, FunctionMemberSynonymicSimpleResource> functionMemberSynonymicSimpleMapperToResourceFunction() {
		return new ModelMapperFunction<>(FunctionMemberSynonymicSimple.class,
				FunctionMemberSynonymicSimpleResource.class);
	}

	/**
	 * FunctionMemberSynonymicSimple resource assembler
	 *
	 * @return FunctionMemberSynonymicSimpleResourceAssembler the model resource
	 *         assembler
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public FunctionMemberSynonymicSimpleResourceAssembler functionMemberSynonymicSimpleResourceAssembler() {
		return new FunctionMemberSynonymicSimpleResourceAssembler(FunctionMemberSynonymicSimpleController.class,
				FunctionMemberSynonymicSimple.class, FunctionMemberSynonymicSimpleResource.class);
	}

}
