package org.sylrsykssoft.java.musbands.admin.instrument.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@EntityScan("org.sylrsykssoft.java.musbands.admin.instrument.domain")
@ComponentScan({
	"org.sylrsykssoft.coreapi.framework.library.*",
	"org.sylrsykssoft.coreapi.framework.api.*",
	"org.sylrsykssoft.coreapi.framework.database.*",
	"org.sylrsykssoft.coreapi.framework.service.*",
	"org.sylrsykssoft.coreapi.framework.web.*",
	"org.sylrsykssoft.coreapi.framework.mail.*",
	"org.sylrsykssoft.java.musbands.admin.instrument.*"
})
@EnableJpaRepositories(basePackages = {
"org.sylrsykssoft.java.musbands.admin.instrument.repository" }, repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class InstrumentConfiguration {

}