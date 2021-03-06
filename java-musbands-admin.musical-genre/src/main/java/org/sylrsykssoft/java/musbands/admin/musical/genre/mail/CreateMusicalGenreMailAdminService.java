package org.sylrsykssoft.java.musbands.admin.musical.genre.mail;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CREATE_MAIL_SERVICE_NAME;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.mail.service.BaseAdminMailService;
import org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiService;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Mail service
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(CREATE_MAIL_SERVICE_NAME)
public class CreateMusicalGenreMailAdminService extends BaseAdminMailService<MusicalGenreResource>
		implements MailAdminApiService<MusicalGenreResource> {

	/**
	 * {@inheritDoc}}
	 */
	@Override
	public void setMailtTO(final MusicalGenreResource source) {
		this.mailto = MusicalGenreMailTO.musicalGenreMailTOBuilder()
				.from(serviceConfiguration.getFrom()).to(serviceConfiguration.getTo()).subject(source.getName())
				.content(Optional.of(source.getDescription()))
				.templateName(Optional.of(serviceConfiguration.getTemplateName())).build();
	}

}
