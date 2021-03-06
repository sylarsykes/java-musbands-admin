package org.sylrsykssoft.java.musbands.admin.application.test.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.sylrsykssoft.coreapi.framework.web.configuration.annotation.EnableCoreApiFrameworkWebInternationalization;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@ComponentScan(basePackages = { "org.sylrsykssoft.coreapi.framework.library.configuration",
"org.sylrsykssoft.java.musbands.admin.client.configuration" })
@EnableCoreApiFrameworkWebInternationalization
// Exclude database
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class MusbandsAdminTestAplicationConfiguration {

}
