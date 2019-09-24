package org.sylrsykssoft.java.musbands.admin.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.sylrsykssoft.java.musbands.admin.client.FunctionMemberRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.client.InstrumentRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.client.MusicalGenreRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@ComponentScan(basePackages = { "org.sylrsykssoft.coreapi.framework.library.util",
"org.sylrsykssoft.coreapi.framework.web.configuration" })
public class MusbandsAdminClientConfiguration {

	/**
	 * Function Member Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<FunctionMemberResource,
	 *         FunctionMember>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public FunctionMemberRestTemplateController functionMemberControllerRestTemplate() {
		return new FunctionMemberRestTemplateController(FunctionMemberResource.class);
	}

	/**
	 * Instrument Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<FunctionMemberResource,
	 *         FunctionMember>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public InstrumentRestTemplateController instrumentControllerRestTemplate() {
		return new InstrumentRestTemplateController(InstrumentResource.class);
	}

	/**
	 * Musical genre Rest Controller Bean
	 * 
	 * @return BaseAdminRestTemplateController<FunctionMemberResource,
	 *         FunctionMember>
	 */
	@Bean
	@Scope("prototype")
	@Lazy
	public MusicalGenreRestTemplateController musicalGenreControllerRestTemplate() {
		return new MusicalGenreRestTemplateController(MusicalGenreResource.class);
	}

}
