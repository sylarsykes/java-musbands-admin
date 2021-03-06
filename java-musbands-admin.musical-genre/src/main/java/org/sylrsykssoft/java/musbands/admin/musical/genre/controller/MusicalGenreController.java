package org.sylrsykssoft.java.musbands.admin.musical.genre.controller;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.library.error.exception.CoreApiFrameworkLibraryException;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil.LogMessageLevel;
import org.sylrsykssoft.coreapi.framework.mail.service.MailAdminApiFactoryService;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.mail.MusicalGenreMailServiceConfiguration;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Rest Controller for Musical Genre API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
@Api(value = "Musical Genre API", tags = "Musical Genre API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
+ ", " + MediaTypes.HAL_JSON_VALUE)
public class MusicalGenreController
extends BaseAdminController<MusicalGenreResource, MusicalGenre> {

	@Autowired
	private MusicalGenreService musicalGenreService;

	@Autowired
	private MailAdminApiFactoryService<MusicalGenreResource> factoryMailService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	@ApiOperation(value = "Create an entry", httpMethod = "POST", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created entry"),
			@ApiResponse(code = 201, message = "Successfully created entry"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = {MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(HttpStatus.CREATED)
	public MusicalGenreResource create(final @RequestBody MusicalGenreResource entity)
			throws NotFoundEntityException, CoreApiFrameworkLibraryException {
		final MusicalGenreResource result = super.create(entity);

		try {
			factoryMailService.executeAsync(MusicalGenreMailServiceConfiguration
					.valueOfServiceName(MusicalGenreMailServiceConfiguration.CREATE.getServiceName()), result, true);
		} catch (final Exception e) {
			LoggerUtil.message(LogMessageLevel.WARN,
					"MusicalGenreController::create not Error in send mail for resource -> {}", result);
			throw new CoreApiFrameworkLibraryException(e);
		}

		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusicalGenreService getAdminService() {
		return musicalGenreService;
	}
}
