package org.sylrsykssoft.java.musbands.admin.application.configuration;

import static org.sylrsykssoft.java.musbands.admin.application.configuration.MusbandsAdminConstants.CACHE_MANGER_BEAN_NAME;
import static org.sylrsykssoft.java.musbands.admin.application.configuration.MusbandsAdminConstants.CACHE_NAME;

import java.util.Arrays;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.sylrsykssoft.coreapi.framework.web.configuration.annotation.EnableCoreApiFrameworkWebInternationalization;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;

/**
 * Global configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@ComponentScan({ "org.sylrsykssoft.java.musbands.admin.function.member.*",
		"org.sylrsykssoft.java.musbands.admin.instrument.*", "org.sylrsykssoft.java.musbands.admin.musical.genre.*",
		"org.sylrsykssoft.java.musbands.admin.users.*" })
@EnableCaching
@EnableEncryptableProperties
@EnableCoreApiFrameworkWebInternationalization
@EncryptablePropertySource(name = "EncryptedProperties", value = "classpath:jasypt.properties")
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

	@Bean
	@ConfigurationProperties("jasypt.encryptor")
	public SimpleStringPBEConfig jasypConfig() {
		final SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		return config;
	}

	@Bean
	public StringEncryptor jasyptEncryptor() {
		final PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		encryptor.setConfig(jasypConfig());
		return encryptor;
	}
}
