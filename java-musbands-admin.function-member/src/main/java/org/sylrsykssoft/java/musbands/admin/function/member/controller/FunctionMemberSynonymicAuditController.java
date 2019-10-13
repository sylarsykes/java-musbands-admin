package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CONTROLLER_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CONTROLLER_AUDIT_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.audit.controller.BaseAdminSimpleAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberSynonymicAuditService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Function Member API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_AUDIT_NAME)
@RequestMapping(CONTROLLER_AUDIT_REQUEST_MAPPING)
@Api(value = "Function Member Synonymic Audit API")
public class FunctionMemberSynonymicAuditController
extends BaseAdminSimpleAuditController<FunctionMemberSynonymicAuditResource, FunctionMemberSynonymicSimple> {

	@Autowired
	private FunctionMemberSynonymicAuditService functionMemberService;


	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionMemberSynonymicAuditService getAdminService() {
		return functionMemberService;
	}

}
