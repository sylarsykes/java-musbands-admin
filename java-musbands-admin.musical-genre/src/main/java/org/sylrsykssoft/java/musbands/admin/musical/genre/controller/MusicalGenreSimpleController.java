package org.sylrsykssoft.java.musbands.admin.musical.genre.controller;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_SIMPLE_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminSimpleController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreSimpleResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreSimpleService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Musical Genre Simple API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_SIMPLE_NAME)
@RequestMapping(CONTROLLER_SIMPLE_REQUEST_MAPPING)
@Api(value = "Musical Genre Simple API", tags = "Musical Genre Simple API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
		+ ", " + MediaTypes.HAL_JSON_VALUE)
public class MusicalGenreSimpleController
extends BaseAdminSimpleController<MusicalGenreSimpleResource, MusicalGenre> {

	@Autowired
	private MusicalGenreSimpleService musicalGenreService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusicalGenreSimpleService getAdminService() {
		return musicalGenreService;
	}
}
