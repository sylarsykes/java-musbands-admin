package org.sylrsykssoft.java.musbands.admin.function.member.mail;

import java.util.List;
import java.util.Optional;

import org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;

import lombok.Builder;

/**
 * TO mail instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class FunctionMemberMailTO extends AdminMailTO<FunctionMemberResource> {

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
	 * @see FunctionMemberConstants.MAILTO_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberMailTOBuilder")
	public FunctionMemberMailTO(final String from, final String to, final Optional<List<String>> cc, final String subject,
			final Optional<String> content, final Optional<String> templateName) {
		super(from, to, cc, subject, content, templateName);
	}
}
