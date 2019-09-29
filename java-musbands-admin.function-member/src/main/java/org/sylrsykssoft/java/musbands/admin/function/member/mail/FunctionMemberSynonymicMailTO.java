package org.sylrsykssoft.java.musbands.admin.function.member.mail;

import java.util.List;
import java.util.Optional;

import org.springframework.lang.Nullable;
import org.sylrsykssoft.coreapi.framework.mail.domain.AdminSimpleMailTO;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicSimpleResource;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

/**
 * TO mail instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberSynonymicMailTO extends AdminSimpleMailTO<FunctionMemberSynonymicSimpleResource> {

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
	public FunctionMemberSynonymicMailTO(final @NonNull String from, final @NonNull String to,
			final @Nullable Optional<List<String>> cc, final @NonNull String subject,
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
	public FunctionMemberSynonymicMailTO(final @NonNull String from, final @NonNull String to,
			final @NonNull String subject) {
		super(from, to, subject);
	}
}
