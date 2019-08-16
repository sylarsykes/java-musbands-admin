package org.sylrsykssoft.java.musbands.admin.client.configuration;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_REQUEST_NAME;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class MusbandsAdminClientConfiguration {

	@Value("${spring.data.rest.base-path}")
	private String basePath;

	@Bean
	@Scope("prototype")
	@Lazy
	public BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre> musicalGenreControllerRestTemplate() {
		return new BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre>(basePath,
				CONTROLLER_REQUEST_NAME, MusicalGenreResource.class);
	}
}
