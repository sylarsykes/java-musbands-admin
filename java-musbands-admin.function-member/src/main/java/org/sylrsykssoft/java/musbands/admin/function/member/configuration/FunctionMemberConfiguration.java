package org.sylrsykssoft.java.musbands.admin.function.member.configuration;

import static org.sylrsykssoft.coreapi.framework.mail.configuration.CoreApiFrameworkMailConstants.FREEMAKER_TEMPLATE_BEAN_NAME;
import static org.sylrsykssoft.coreapi.framework.mail.configuration.CoreApiFrameworkMailConstants.FREEMAKER_TEMPLATE_FOLDER_PATH;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@EntityScan("org.sylrsykssoft.java.musbands.admin.function.member.domain")
@ComponentScan({
	"org.sylrsykssoft.coreapi.framework.library.*",
	"org.sylrsykssoft.coreapi.framework.api.*",
	"org.sylrsykssoft.coreapi.framework.database.*",
	"org.sylrsykssoft.coreapi.framework.service.*",
	"org.sylrsykssoft.coreapi.framework.web.*",
	"org.sylrsykssoft.coreapi.framework.mail.*",
	"org.sylrsykssoft.java.musbands.admin.function.member.*"
})
@EnableJpaRepositories({ "org.sylrsykssoft.java.musbands.admin.function.member.repository" })
public class FunctionMemberConfiguration {

	/**
	 * Template bean
	 * 
	 * @param resourceLoader
	 * 
	 * @return FreeMarkerConfigurationFactoryBean
	 */
	@Bean(name = FREEMAKER_TEMPLATE_BEAN_NAME)
	public FreeMarkerConfigurationFactoryBean getFreeMarkerConfiguration(final ResourceLoader resourceLoader) {
		final FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
		bean.setTemplateLoaderPath(FREEMAKER_TEMPLATE_FOLDER_PATH);
		return bean;
	}
}
