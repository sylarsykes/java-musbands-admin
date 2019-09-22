package org.sylrsykssoft.java.musbands.admin.instrument.controller;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.CONTROLLER_AUDIT_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.audit.controller.BaseAdminAuditController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentAuditResource;
import org.sylrsykssoft.java.musbands.admin.instrument.service.InstrumentAuditService;

/**
 * Rest Controller for Instrument Audit API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_AUDIT_NAME)
@RequestMapping(CONTROLLER_AUDIT_REQUEST_MAPPING)
public class InstrumentAuditController extends BaseAdminAuditController<InstrumentAuditResource, Instrument> {

	@Autowired
	private InstrumentAuditService instrumentAuditService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InstrumentAuditService getAdminService() {
		return instrumentAuditService;
	}
}
