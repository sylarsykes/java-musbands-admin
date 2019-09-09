package org.sylrsykssoft.java.musbands.admin.musical.genre.controller;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_AUDIT_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.audit.controller.BaseAdminAuditController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreAuditResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.service.MusicalGenreAuditService;

/**
 * Rest Controller for Musical Genre API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_AUDIT_NAME)
@RequestMapping(CONTROLLER_AUDIT_REQUEST_MAPPING)
public class MusicalGenreAuditController extends BaseAdminAuditController<MusicalGenreAuditResource, MusicalGenre> {

	@Autowired
	private MusicalGenreAuditService musicalGenreAuditService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusicalGenreAuditService getAdminService() {
		return musicalGenreAuditService;
	}
}
