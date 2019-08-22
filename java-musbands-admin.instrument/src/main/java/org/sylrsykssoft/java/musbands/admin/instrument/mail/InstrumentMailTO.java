package org.sylrsykssoft.java.musbands.admin.instrument.mail;

import java.util.List;
import java.util.Optional;

import org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
import org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;

import lombok.Builder;

/**
 * TO mail instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class InstrumentMailTO extends AdminMailTO<InstrumentResource> {

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
	 * @see InstrumentConstants.MAILTO_BUILDER_NAME
	 */
	@Builder(builderMethodName = "instrumentMailTOBuilder")
	public InstrumentMailTO(final String from, final String to, final Optional<List<String>> cc, final String subject,
			final Optional<String> content, final Optional<String> templateName) {
		super(from, to, cc, subject, content, templateName);
	}
}
