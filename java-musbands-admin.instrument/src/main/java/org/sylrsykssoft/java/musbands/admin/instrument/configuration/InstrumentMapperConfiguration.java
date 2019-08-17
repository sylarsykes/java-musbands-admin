package org.sylrsykssoft.java.musbands.admin.instrument.configuration;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.instrument.controller.InstrumentController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentResourceAssembler;

/**
 * InstrumentMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class InstrumentMapperConfiguration {

	/**
	 * instrument mapper to entity function.
	 *
	 * @return ModelMapperFunction<instrumentResource, instrument> the model mapper
	 *         function
	 */
	@Bean(MAPPER_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<InstrumentResource, Instrument> instrumentMapperToEntityFunction() {
		return new ModelMapperFunction<InstrumentResource, Instrument>(InstrumentResource.class, Instrument.class);
	}


	/**
	 * instrument mapper to resource function.
	 *
	 * @return ModelMapperFunction<instrument, instrumentResource> the model mapper
	 *         function
	 */
	@Bean(MAPPER_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<Instrument, InstrumentResource> instrumentMapperToResourceFunction() {
		return new ModelMapperFunction<Instrument, InstrumentResource>(Instrument.class, InstrumentResource.class);
	}

	/**
	 * instrument resource assembler
	 *
	 * @return instrumentResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public InstrumentResourceAssembler instrumentResourceAssembler() {
		return new InstrumentResourceAssembler(InstrumentController.class, Instrument.class, InstrumentResource.class);
	}
}
