package org.sylrsykssoft.java.musbands.admin.instrument.configuration;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_RESOURCE_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_SIMPLE_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentAuditController;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentController;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentSimpleController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentAuditResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentSimpleResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentAuditResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentResourceAssembler;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentSimpleResourceAssembler;

/**
 * InstrumentMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class InstrumentMapperConfiguration {

	/**
	 * InstrumentAudit mapper to entity function.
	 *
	 * @return ModelMapperFunction<InstrumentAuditResource, Instrument> the model
	 *         mapper function
	 */
	@Bean(MAPPER_AUDIT_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<InstrumentAuditResource, Instrument> instrumentAuditMapperToEntityFunction() {
		return new ModelMapperFunction<>(InstrumentAuditResource.class, Instrument.class);
	}

	/**
	 * InstrumentAudit mapper to resource function.
	 *
	 * @return ModelMapperFunction<Instrument, InstrumentAuditResource> the model
	 *         mapper function
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<Instrument, InstrumentAuditResource> instrumentAuditMapperToResourceFunction() {
		return new ModelMapperFunction<>(Instrument.class, InstrumentAuditResource.class);
	}

	/**
	 * InstrumentAudit resource assembler
	 *
	 * @return InstrumentAuditResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public InstrumentAuditResourceAssembler instrumentAuditResourceAssembler() {
		return new InstrumentAuditResourceAssembler(InstrumentAuditController.class, Instrument.class,
				InstrumentAuditResource.class);
	}

	/**
	 * Instrument mapper to entity function.
	 *
	 * @return ModelMapperFunction<InstrumentResource, Instrument> the model mapper
	 *         function
	 */
	@Bean(MAPPER_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<InstrumentResource, Instrument> instrumentMapperToEntityFunction() {
		return new ModelMapperFunction<>(InstrumentResource.class, Instrument.class);
	}

	/**
	 * Instrument mapper to resource function.
	 *
	 * @return ModelMapperFunction<Instrument, InstrumentResource> the model mapper
	 *         function
	 */
	@Bean(MAPPER_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<Instrument, InstrumentResource> instrumentMapperToResourceFunction() {
		return new ModelMapperFunction<>(Instrument.class, InstrumentResource.class);
	}

	/**
	 * Instrument resource assembler
	 *
	 * @return InstrumentResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public InstrumentResourceAssembler instrumentResourceAssembler() {
		return new InstrumentResourceAssembler(InstrumentController.class, Instrument.class, InstrumentResource.class);
	}

	/**
	 * InstrumentSimple mapper to entity function.
	 *
	 * @return ModelMapperFunction<InstrumentSimpleResource, Instrument> the model
	 *         mapper function
	 */
	@Bean(MAPPER_SIMPLE_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<InstrumentSimpleResource, Instrument> instrumentSimpleMapperToEntityFunction() {
		return new ModelMapperFunction<>(InstrumentSimpleResource.class, Instrument.class);
	}

	/**
	 * InstrumentSimple mapper to resource function.
	 *
	 * @return ModelMapperFunction<Instrument, InstrumentSimpleResource> the model
	 *         mapper function
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<Instrument, InstrumentSimpleResource> instrumentSimpleMapperToResourceFunction() {
		return new ModelMapperFunction<>(Instrument.class, InstrumentSimpleResource.class);
	}

	/**
	 * InstrumentSimple resource assembler
	 *
	 * @return InstrumentSimpleResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_SIMPLE_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public InstrumentSimpleResourceAssembler instrumentSimpleResourceAssembler() {
		return new InstrumentSimpleResourceAssembler(InstrumentSimpleController.class, Instrument.class,
				InstrumentSimpleResource.class);
	}

}
