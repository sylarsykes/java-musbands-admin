package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_AUDIT_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.audit.controller.BaseAdminAuditController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberAuditService;

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
@Api(value = "Function Member Audit API")
public class FunctionMemberAuditController
extends BaseAdminAuditController<FunctionMemberAuditResource, FunctionMember> {

	@Autowired
	private FunctionMemberAuditService functionMemberService;


	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionMemberAuditService getAdminService() {
		return functionMemberService;
	}

}
