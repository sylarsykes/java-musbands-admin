package org.sylrsykssoft.java.musbands.admin.musical.genre.configuration;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.MAPPER_RESOURCE_FUNCTION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.musical.genre.controller.MusicalGenreController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.assembler.MusicalGenreResourceAssembler;

/**
 * MusicalGenreMapperConfiguration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class MusicalGenreMapperConfiguration {

	/**
	 * MusicalGenre mapper to entity function.
	 *
	 * @return ModelMapperFunction<MusicalGenreResource, MusicalGenre> the model
	 *         mapper function
	 */
	@Bean(MAPPER_ENTITY_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<MusicalGenreResource, MusicalGenre> musicalGenreMapperToEntityFunction() {
		return new ModelMapperFunction<MusicalGenreResource, MusicalGenre>(MusicalGenreResource.class, MusicalGenre.class);
	}


	/**
	 * MusicalGenre mapper to resource function.
	 *
	 * @return ModelMapperFunction<MusicalGenre, MusicalGenreResource> the model
	 *         mapper function
	 */
	@Bean(MAPPER_RESOURCE_FUNCTION)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public ModelMapperFunction<MusicalGenre, MusicalGenreResource> musicalGenreMapperToResourceFunction() {
		return new ModelMapperFunction<MusicalGenre, MusicalGenreResource>(MusicalGenre.class, MusicalGenreResource.class);
	}

	/**
	 * MusicalGenre resource assembler
	 *
	 * @return MusicalGenreResourceAssembler the model resource assembler
	 */
	@Bean(MAPPER_RESOURCE_ASSEMBLER)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public MusicalGenreResourceAssembler musicalGenreResourceAssembler() {
		return new MusicalGenreResourceAssembler(MusicalGenreController.class, MusicalGenre.class, MusicalGenreResource.class);
	}
}
