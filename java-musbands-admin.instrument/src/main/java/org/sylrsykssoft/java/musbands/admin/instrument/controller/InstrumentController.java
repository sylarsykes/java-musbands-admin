package org.sylrsykssoft.java.musbands.admin.instrument.controller;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;
import org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentService;

/**
 * Rest Controller for Instrument API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
public class InstrumentController extends BaseAdminController<InstrumentResource, Instrument> {

	@Autowired
	private InstrumentService instrumentService;

	/**
	 * {@inheritDoc}
	 */
	public InstrumentService getAdminService() {
		return instrumentService;
	}
}
