package org.sylrsykssoft.java.musbands.admin.application.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

/**
 * DataSource configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@PropertySource({ "classpath:database.properties" })
//@EnableJpaRepositories({
//	"org.sylrsykssoft.java.musbands.admin.function.member.repository",
//	"org.sylrsykssoft.java.musbands.admin.instrument.repository",
//	"org.sylrsykssoft.java.musbands.admin.musical.genre.repository",
//})
public class MusbandsAdminDataSourceConfiguration {

	@Autowired
	private DataSourceProperties dataSourceProperties;

	@Bean
	@Primary
	public DataSource dataSource() {
		return DataSourceBuilder.create().username(dataSourceProperties.getUsername())
				.password(dataSourceProperties.getPassword()).url(dataSourceProperties.getUrl()).build();
	}

	@LiquibaseDataSource
	@Bean
	public DataSource liquibaseDataSource() {
		final DataSource ds = DataSourceBuilder.create().username(dataSourceProperties.getUsername())
				.password(dataSourceProperties.getPassword()).url(dataSourceProperties.getUrl()).build();
		return ds;
	}

}
