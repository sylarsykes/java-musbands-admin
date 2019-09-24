package org.sylrsykssoft.java.musbands.admin.client;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;

/**
 * Instrument Rest Controller Bean
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class InstrumentRestTemplateController
		extends BaseAdminRestTemplateController<InstrumentResource, Instrument> {

	/**
	 * AllArgsConstructor
	 * 
	 * @param responseType
	 */
	@ConstructorProperties({ "responseType" })
	public InstrumentRestTemplateController(final Class<InstrumentResource> responseType) {
		super(responseType);
	}

}
