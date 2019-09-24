package org.sylrsykssoft.java.musbands.admin.application.test.function.member;

import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_ADMIN_REQUEST_MAPPING_MUSICAL_GENRE;
import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_REQUEST_NAME_MUSICAL_GENRE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil.LogMessageLevel;
import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminSimpleRestController;
import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminSimpleRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.client.MusicalGenreRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * MusbandsAdminTestFunctionMemberController
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController
@RequestMapping(CONTROLLER_ADMIN_REQUEST_MAPPING_MUSICAL_GENRE)
public class MusbandsAdminTestMusicalGenreController
		extends BaseAdminSimpleRestController<MusicalGenreResource, MusicalGenre> {

	@Value("${coreapi.framework.rest.base-path}")
	private String basePath;
	@Value("${coreapi.framework.simple.rest.base-path}")
	private String baseSimplePath;
	@Value("${coreapi.framework.audit.rest.base-path}")
	private String baseAuditPath;

	@Autowired
	private MusicalGenreRestTemplateController musicalGenreRestTemplateController;

	/**
	 * Find all entries.
	 * 
	 * @return Iterable<T> entries.
	 * 
	 * @throws NotFoundEntityException
	 */
	@GetMapping(produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.FOUND)
	public Iterable<MusicalGenreResource> findAll() throws NotFoundEntityException {
		LoggerUtil.message(LogMessageLevel.INFO,
				"MusbandsAdminTestMusicalGenreController::findAll Finding all entries");

		final UriComponents url = UriComponentsBuilder.fromHttpUrl(basePath)
				.path("/" + CONTROLLER_REQUEST_NAME_MUSICAL_GENRE).build();

		final Iterable<MusicalGenreResource> result = getRestTemplateController().findAll(url.toString());

		LoggerUtil.message(LogMessageLevel.INFO, "MusbandsAdminTestMusicalGenreController::findAll Result -> {}",
				result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleRestTemplateController<MusicalGenreResource, MusicalGenre> getRestTemplateController() {
		return musicalGenreRestTemplateController;
	}
}
