package org.sylrsykssoft.java.musbands.admin.client;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Musical genre Rest Controller Bean
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class MusicalGenreRestTemplateController
		extends BaseAdminRestTemplateController<MusicalGenreResource, MusicalGenre> {

	/**
	 * AllArgsConstructor
	 * 
	 * @param responseType
	 */
	@ConstructorProperties({ "responseType" })
	public MusicalGenreRestTemplateController(final Class<MusicalGenreResource> responseType) {
		super(responseType);
	}

}
