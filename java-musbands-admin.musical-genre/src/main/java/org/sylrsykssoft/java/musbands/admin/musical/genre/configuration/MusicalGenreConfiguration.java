package org.sylrsykssoft.java.musbands.admin.musical.genre.configuration;

import static org.sylrsykssoft.coreapi.framework.audit.configuration.BaseAdminAuditConstants.AUDITORAWARE_COMPONENT_NAME;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.sylrsykssoft.coreapi.framework.audit.configuration.CoreApiFrameworkAuditAuditorAwareImpl;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@EntityScan("org.sylrsykssoft.java.musbands.admin.musical.genre.domain")
@ComponentScan({
	"org.sylrsykssoft.coreapi.framework.library.*",
	"org.sylrsykssoft.coreapi.framework.api.*",
	"org.sylrsykssoft.coreapi.framework.database.*",
	"org.sylrsykssoft.coreapi.framework.service.*",
	"org.sylrsykssoft.coreapi.framework.web.*",
	"org.sylrsykssoft.coreapi.framework.mail.*",
	"org.sylrsykssoft.java.musbands.admin.musical.genre.*"
})
@EnableJpaRepositories(basePackages = {
"org.sylrsykssoft.java.musbands.admin.musical.genre.repository" }, repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
@EnableJpaAuditing(auditorAwareRef = AUDITORAWARE_COMPONENT_NAME)
public class MusicalGenreConfiguration {

	/**
	 * AuditAware bean
	 * 
	 * @return AuditorAware
	 */
	@Bean(AUDITORAWARE_COMPONENT_NAME)
	@Scope(value = "prototype")
	@Lazy(value = true)
	public AuditorAware<String> defaultAuditorAwareImpl() {
		return new CoreApiFrameworkAuditAuditorAwareImpl();
	}
}
