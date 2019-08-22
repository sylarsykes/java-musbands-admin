package org.sylrsykssoft.java.musbands.admin.function.member.mail;

import java.util.List;
import java.util.Optional;

import org.sylrsykssoft.coreapi.framework.mail.domain.AdminMailTO;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicResource;

import lombok.Builder;

/**
 * TO mail instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class FunctionMemberSynonymicMailTO extends AdminMailTO<FunctionMemberSynonymicResource> {

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
	 * @see FunctionMemberSynonymicConstants.MAILTO_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberSynonymicMailTOBuilder")
	public FunctionMemberSynonymicMailTO(final String from, final String to, final Optional<List<String>> cc, final String subject,
			final Optional<String> content, final Optional<String> templateName) {
		super(from, to, cc, subject, content, templateName);
	}
}
