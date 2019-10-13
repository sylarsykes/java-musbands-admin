package org.sylrsykssoft.java.musbands.admin.application.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.sylrsykssoft.coreapi.framework.swagger.BasePathAwareRelativePathProvider;
import org.sylrsykssoft.coreapi.framework.swagger.configuration.property.CoreApiFrameworkSwagger2ConfigProperties;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.ModelRendering;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.TagsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 configuration
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Configuration
@PropertySource("classpath:swagger2.properties")
@EnableConfigurationProperties(CoreApiFrameworkSwagger2ConfigProperties.class)
@EnableSwagger2
public class MusbandsAdminSwagger2Configuration {

	@Autowired
	private CoreApiFrameworkSwagger2ConfigProperties coreApiFrameworkSwagger2ConfigProperties;

	/**
	 * Api info
	 * 
	 * @return ApiInfo
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(coreApiFrameworkSwagger2ConfigProperties.getTitle())
				.description(coreApiFrameworkSwagger2ConfigProperties.getDescription())
				.version(coreApiFrameworkSwagger2ConfigProperties.getApiVersion())
				.contact(new Contact(coreApiFrameworkSwagger2ConfigProperties.getContactName(),
						coreApiFrameworkSwagger2ConfigProperties.getContactUri(),
						coreApiFrameworkSwagger2ConfigProperties.getContactEmail()))
				.license(coreApiFrameworkSwagger2ConfigProperties.getLicense())
				.licenseUrl(coreApiFrameworkSwagger2ConfigProperties.getLicenseUri())
				.build();
	}

	/**
	 * Docket api bean
	 * 
	 * @return Docket
	 */
	@Bean
	public Docket musbandsAdminApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				//				.host("www.mydomain.com")
				.pathProvider(new BasePathAwareRelativePathProvider(
						"/api/admin/" + coreApiFrameworkSwagger2ConfigProperties.getApiVersion()))
				.apiInfo(apiInfo())
				.consumes(new HashSet<>(Arrays.asList(MediaType.APPLICATION_JSON_VALUE)))
				.produces(new HashSet<>(Arrays.asList(MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE)))
				.select()
				.apis(RequestHandlerSelectors
						.basePackage("org.sylrsykssoft.java.musbands.admin.function.member.controller"))
				.apis(RequestHandlerSelectors.basePackage("org.sylrsykssoft.java.musbands.admin.instrument.controller"))
				.apis(RequestHandlerSelectors
						.basePackage("org.sylrsykssoft.java.musbands.admin.musical.genre.controller"))
				.paths(regex("/api/admin/" + coreApiFrameworkSwagger2ConfigProperties.getApiVersion() + "/.*")).build()
				.directModelSubstitute(LocalDate.class, String.class).genericModelSubstitutes(ResponseEntity.class)
				.useDefaultResponseMessages(
						Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getUseDefaultResponseMessages()))
				.enableUrlTemplating(
						Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getEnableUrlTemplating()));
	}

	/**
	 * Swagger UI configuration
	 * 
	 * @param configProperties
	 * @return UiConfiguration
	 */
	@Bean
	public UiConfiguration uiConfig() {

		return UiConfigurationBuilder.builder()
				.deepLinking(Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getDeepLinking()))
				.displayOperationId(Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getDisplayOperationId()))
				.defaultModelsExpandDepth(
						Integer.valueOf(coreApiFrameworkSwagger2ConfigProperties.getDefaultModelsExpandDepth()))
				.defaultModelExpandDepth(
						Integer.valueOf(coreApiFrameworkSwagger2ConfigProperties.getDefaultModelExpandDepth()))
				.defaultModelRendering(ModelRendering.EXAMPLE)
				.displayRequestDuration(
						Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getDisplayRequestDuration()))
				.docExpansion(DocExpansion.NONE)
				.filter(Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getFilter()))
				.maxDisplayedTags(Integer.valueOf(coreApiFrameworkSwagger2ConfigProperties.getMaxDisplayedTags()))
				.operationsSorter(OperationsSorter.ALPHA)
				.showExtensions(Boolean.valueOf(coreApiFrameworkSwagger2ConfigProperties.getShowExtensions()))
				.tagsSorter(TagsSorter.ALPHA)
				.supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS).validatorUrl(null).build();
	}

}
