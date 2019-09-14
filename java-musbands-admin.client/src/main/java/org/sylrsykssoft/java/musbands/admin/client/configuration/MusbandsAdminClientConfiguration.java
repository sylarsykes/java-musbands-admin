package org.sylrsykssoft.java.musbands.admin.client.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@ConditionalOnProperty(value = "basePath", prefix = "spring.data.rest", matchIfMissing = true)
public class MusbandsAdminClientConfiguration {

	@Value("${spring.data.rest.base-path}")
	private String basePath;

	/**
	 * Function Member Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<FunctionMemberResource,
	 *         FunctionMember>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public BaseAdminRestTemplateController<FunctionMemberResource, FunctionMember> functionMemberControllerRestTemplate() {
		return new BaseAdminRestTemplateController<>(basePath,
				FunctionMemberConstants.CONTROLLER_REQUEST_NAME, FunctionMemberResource.class);
	}

	/**
	 * Instrument Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<InstrumentResource, Instrument>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public BaseAdminRestTemplateController<InstrumentResource, Instrument> instrumentControllerRestTemplate() {
		return new BaseAdminRestTemplateController<>(basePath,
				InstrumentConstants.CONTROLLER_REQUEST_NAME, InstrumentResource.class);
	}

	/**
	 * Musical Genre Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre> musicalGenreControllerRestTemplate() {
		return new BaseAdminRestTemplateController<>(basePath,
				MusicalGenreConstants.CONTROLLER_REQUEST_NAME, MusicalGenreResource.class);
	}
}
