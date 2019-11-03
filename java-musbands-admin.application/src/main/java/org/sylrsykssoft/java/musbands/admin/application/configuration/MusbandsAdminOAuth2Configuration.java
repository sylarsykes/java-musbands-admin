package org.sylrsykssoft.java.musbands.admin.application.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.sylrsykssoft.coreapi.framework.security.configuration.CoreApiFrameworkSecurityWebSecurityConfiguration;
import org.sylrsykssoft.coreapi.framework.security.oauth.configuration.CoreApiFrameworkSecurityOAuth2DataSourceConfiguration;
import org.sylrsykssoft.coreapi.framework.security.oauth.configuration.CoreaApiFrameworkSecurityOAuth2Configuration;

/**
 * Swagger2 configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Configuration
@PropertySource("classpath:jasypt.properties")
//@ComponentScan({ "org.sylrsykssoft.coreapi.framework.security.configuration.*",
//"org.sylrsykssoft.coreapi.framework.security.oauth.configuration.*" })
@Import({ CoreApiFrameworkSecurityWebSecurityConfiguration.class,
	CoreApiFrameworkSecurityOAuth2DataSourceConfiguration.class,
	CoreaApiFrameworkSecurityOAuth2Configuration.class })
@EnableAuthorizationServer
public class MusbandsAdminOAuth2Configuration extends AuthorizationServerConfigurerAdapter {

}
