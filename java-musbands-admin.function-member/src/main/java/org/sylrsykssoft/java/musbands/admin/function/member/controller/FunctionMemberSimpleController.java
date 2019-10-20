package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_SIMPLE_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberSimpleService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Function Member API
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController(CONTROLLER_SIMPLE_NAME)
@RequestMapping(CONTROLLER_SIMPLE_REQUEST_MAPPING)
@Api(value = "Function Member Simple API", tags = "Function Member Simple API", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE
		+ ", " + MediaTypes.HAL_JSON_VALUE)
public class FunctionMemberSimpleController
extends BaseAdminSimpleController<FunctionMemberSimpleResource, FunctionMember> {

	@Autowired
	private FunctionMemberSimpleService functionMemberService;


	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionMemberSimpleService getAdminService() {
		return functionMemberService;
	}

}
