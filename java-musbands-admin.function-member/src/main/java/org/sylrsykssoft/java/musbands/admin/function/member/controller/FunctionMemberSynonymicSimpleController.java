package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CONTROLLER_SIMPLE_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sylrsykssoft.coreapi.framework.web.BaseAdminSimpleController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.service.FunctionMemberSynonymicSimpleService;

import io.swagger.annotations.Api;

/**
 * Rest Controller for Function Member API
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 * @see https://restfulapi.net/http-methods/
 *
 */
@RestController(CONTROLLER_SIMPLE_NAME)
@RequestMapping(CONTROLLER_SIMPLE_REQUEST_MAPPING)
@Api(value = "Function Member Synonimic Simple API")
public class FunctionMemberSynonymicSimpleController
extends BaseAdminSimpleController<FunctionMemberSynonymicSimpleResource, FunctionMemberSynonymicSimple> {

	@Autowired
	private FunctionMemberSynonymicSimpleService functionMemberService;


	/**
	 * {@inheritDoc}
	 */
	@Override
	public FunctionMemberSynonymicSimpleService getAdminService() {
		return functionMemberService;
	}

}
