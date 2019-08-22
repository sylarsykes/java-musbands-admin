package org.sylrsykssoft.java.musbands.admin.musical.genre.controller;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_REQUEST_MAPPING_TEST;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_TEST_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CREATE_MAIL_SERVICE_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiService;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService;

/**
 * Rest Controller for Musical Genre API Test
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_TEST_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING_TEST)
public class MusicalGenreControllerTest extends BaseAdminController<MusicalGenreResource, MusicalGenre> {

	@Autowired
	private MusicalGenreService musicalGenreService;

	@Autowired
	@Qualifier(CREATE_MAIL_SERVICE_NAME)
	private MailAdminApiService<MusicalGenreResource> createMusicalGenreMailAdminService;

	@Override
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = { MediaTypes.HAL_JSON_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.CREATED)
	public MusicalGenreResource create(final @RequestBody MusicalGenreResource entity) throws NotFoundEntityException {
		final MusicalGenreResource result = super.create(entity);

		createMusicalGenreMailAdminService.send(result, true);

		return result;
	}

	/**
	 * {@inherit}
	 */
	@Override
	public MusicalGenreService getAdminService() {
		return musicalGenreService;
	}

}
