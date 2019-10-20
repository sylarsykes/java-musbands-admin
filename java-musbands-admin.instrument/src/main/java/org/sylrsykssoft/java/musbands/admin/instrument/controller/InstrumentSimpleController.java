package org.sylrsykssoft.java.musbands.admin.instrument.controller;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_SIMPLE_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminSimpleController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentSimpleResource;
import org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentSimpleService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Instrument Simple API
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController(CONTROLLER_SIMPLE_NAME)
@RequestMapping(CONTROLLER_SIMPLE_REQUEST_MAPPING)
@Api(value = "Instrument Simple API", tags = "Instrument Simple API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
+ ", " + MediaTypes.HAL_JSON_VALUE)
public class InstrumentSimpleController
extends BaseAdminSimpleController<InstrumentSimpleResource, Instrument> {

	@Autowired
	private InstrumentSimpleService instrumentService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstrumentSimpleService getAdminService() {
		return instrumentService;
	}
}
