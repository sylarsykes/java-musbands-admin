package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING_TEST;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_TEST_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberService;

/**
 * Rest Controller for Function Member API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_TEST_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING_TEST)
public class FunctionMemberControllerTest extends BaseAdminController<FunctionMemberResource, FunctionMember> {

	@Autowired
	private FunctionMemberService functionMemberService;


	/**
	 * {inheritDoc}
	 */
	public FunctionMemberService getAdminService() {
		return functionMemberService;
	}

}
