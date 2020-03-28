package org.sylrsykssoft.java.musbands.admin.users.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.sylrsykssoft.java.musbands.admin.users.service.MusbandsAdminUsersUserDetailService;

/**
 * UserDetailsService configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
public class MusbandsAdminUserUserDetailServiceConfiguration {

	/**
	 * Get implementation for UserDetailsService.
	 * 
	 * @return UserDetailsService
	 */
	@Bean
	public UserDetailsService userDetailsService() {
		return new MusbandsAdminUsersUserDetailService();
	}

}
