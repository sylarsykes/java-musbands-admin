package org.sylrsykssoft.java.musbands.admin.instrument.controller;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_REQUEST_MAPPING_TEST;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_TEST_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentService;

/**
 * Rest Controller for Instrument API Test
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_TEST_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING_TEST)
public class InstrumentControllerTest extends BaseAdminController<InstrumentResource, Instrument> {

	@Autowired
	private InstrumentService instrumentService;

	/**
	 * {@inherit}
	 */
	public InstrumentService getAdminService() {
		return instrumentService;
	}

}
