package org.sylrsykssoft.java.musbands.admin.musical.genre.mail;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CREATE_MAIL_SERVICE_NAME;

import java.util.HashMap;
import java.util.Map;

import org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiServiceConfiguration;

import lombok.Getter;

/**
 * @author Juan
 *
 */
@Getter
public enum MusicalGenreMailConfiguration implements MailAdminApiServiceConfiguration {

	CREATE(CREATE_MAIL_SERVICE_NAME, "musbands.contact@gmail.com", "sylar.sykes@gmail.com", "create-email.ftl");

	private static final Map<String, MusicalGenreMailConfiguration> BY_SERVICENAME = new HashMap<>();

	static {
		for (final MusicalGenreMailConfiguration serviceMailConfiguration : values()) {
			BY_SERVICENAME.put(serviceMailConfiguration.serviceName, serviceMailConfiguration);
		}
	}

	/**
	 * Get enum by service name;
	 * 
	 * @param serviceName
	 * @return MusicalGenreMailConfiguration
	 */
	public static MailAdminApiServiceConfiguration valueOfServiceName(final String serviceName) {
		return BY_SERVICENAME.get(serviceName);
	}

	private String serviceName;
	private String from;
	private String to;
	private String templateName;

	/**
	 * Default constructor
	 * 
	 * @param serviceName
	 * @param from
	 * @param to
	 * @param templateName
	 */
	private MusicalGenreMailConfiguration(final String serviceName, final String from, final String to,
			final String templateName) {
		this.serviceName = serviceName;
		this.from = from;
		this.to = to;
		this.templateName = templateName;
	}
}
