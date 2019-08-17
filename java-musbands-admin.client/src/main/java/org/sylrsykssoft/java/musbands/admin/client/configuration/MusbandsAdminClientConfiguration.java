package org.sylrsykssoft.java.musbands.admin.client.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;
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
	public BaseAdminRestTemplateController<FunctionMemberResource, FunctionMember> functionMemberControllerRestTemplate() {
		return new BaseAdminRestTemplateController<FunctionMemberResource, FunctionMember>(basePath,
				FunctionMemberConstants.CONTROLLER_REQUEST_NAME, FunctionMemberResource.class);
	}

	@Bean
	@Scope("prototype")
	@Lazy
	public BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre> musicalGenreControllerRestTemplate() {
		return new BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre>(basePath,
				MusicalGenreConstants.CONTROLLER_REQUEST_NAME, MusicalGenreResource.class);
	}
}
