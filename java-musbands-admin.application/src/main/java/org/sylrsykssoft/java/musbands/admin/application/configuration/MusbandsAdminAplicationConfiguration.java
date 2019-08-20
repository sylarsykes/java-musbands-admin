package org.sylrsykssoft.java.musbands.admin.application.configuration;

import static org.sylrsykssoft.java.musbands.admin.application.configuration.MusbandsAdminConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.application.configuration.MusbandsAdminConstants.CACHE_NAME;

import java.util.Arrays;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@PropertySource({ "classpath:application.properties", "classpath:logging.properties", "classpath:database.properties" })
@ComponentScan({ "org.sylrsykssoft.java.musbands.admin.function.member.*",
	"org.sylrsykssoft.java.musbands.admin.instrument.*", "org.sylrsykssoft.java.musbands.admin.musical.genre.*" })
//@EnableJpaRepositories({
//	"org.sylrsykssoft.java.musbands.admin.function.member.repository",
//	"org.sylrsykssoft.java.musbands.admin.instrument.repository",
//	"org.sylrsykssoft.java.musbands.admin.musical.genre.repository",
//})
@EnableCaching
public class MusbandsAdminAplicationConfiguration {

	/**
	 * CacheManager Bean
	 * 
	 * @return CacheManager
	 */
	@Bean(CACHE_MANGER_BEAN_NAME)
	@Primary
	public CacheManager cacheManager() {
		final SimpleCacheManager cacheManager = new SimpleCacheManager();
		cacheManager.setCaches(Arrays.asList(new ConcurrentMapCache(CACHE_NAME)));
		return cacheManager;
	}
}
