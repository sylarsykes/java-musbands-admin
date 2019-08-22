package org.sylrsykssoft.java.musbands.admin.application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@PropertySource("classpath:smtp.properties")
public class MusbandsAdminSmtpConfiguration {

}
