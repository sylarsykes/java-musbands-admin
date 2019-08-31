package org.sylrsykssoft.java.musbands.admin.musical.genre.mail;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.Nullable;
import org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

/**
 * TO mail musical genre
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
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
	public MusicalGenreMailTO(final @NonNull String from, final @NonNull String to,
			final @Nullable Optional<List<String>> cc,
			final @NonNull String subject,
			final @Nullable Optional<String> content, final @Nullable Optional<String> templateName) {
		super(from, to, cc, subject, content, templateName);
	}

	/**
	 * RequiredArgsConstructor
	 * 
	 * @param from
	 * @param to
	 * @param subject
	 * 
	 */
	public MusicalGenreMailTO(final @NonNull String from, final @NonNull String to, final @NonNull String subject) {
		super(from, to, subject);
	}
}
