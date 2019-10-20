package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Function Member API
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController(CONTROLLER_NAME)
@RequestMapping(CONTROLLER_REQUEST_MAPPING)
@Api(value = "Function Member API", tags = "Function Member API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
+ ", " + MediaTypes.HAL_JSON_VALUE)
public class FunctionMemberController extends BaseAdminController<FunctionMemberResource, FunctionMember> {

	@Autowired
	private FunctionMemberService functionMemberService;

	/**
	 * Getter admin service implementation
	 * 
	 * @return BaseAdminService<T, R>
	 */
	@Override
	public FunctionMemberService getAdminService() {
		return functionMemberService;
	}
}
