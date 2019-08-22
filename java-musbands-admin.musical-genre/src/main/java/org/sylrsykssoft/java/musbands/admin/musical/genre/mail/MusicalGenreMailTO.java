package org.sylrsykssoft.java.musbands.admin.musical.genre.mail;

import java.util.List;
import java.util.Optional;

import org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

import lombok.Builder;

/**
 * TO mail musical genre
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class MusicalGenreMailTO extends AdminMailTO<MusicalGenreResource> {

	/**
	 * AllArgsConstructor
	 * 
	 * @param from
	 * @param to
	 * @param cc
	 * @param subject
	 * @param content
	 * @param templateName
	 * 
	 * @see MusicalGenreConstants.MAILTO_BUILDER_NAME
	 */
	@Builder(builderMethodName = "musicalGenreMailTOBuilder")
	public MusicalGenreMailTO(final String from, final String to, final Optional<List<String>> cc, final String subject,
			final Optional<String> content, final Optional<String> templateName) {
		super(from, to, cc, subject, content, templateName);
	}
}
