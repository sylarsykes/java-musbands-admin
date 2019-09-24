package org.sylrsykssoft.java.musbands.admin.application.test.function.member;

import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_ADMIN_REQUEST_MAPPING_FUNCTION_MEMBER;
import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.sylrsykssoft.coreapi.framework.database.exception.NotFoundEntityException;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil;
import org.sylrsykssoft.coreapi.framework.library.util.LoggerUtil.LogMessageLevel;
import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminSimpleRestController;
import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminSimpleRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.client.FunctionMemberRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;

/**
 * MusbandsAdminTestFunctionMemberController
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController
@RequestMapping(CONTROLLER_ADMIN_REQUEST_MAPPING_FUNCTION_MEMBER)
public class MusbandsAdminTestFunctionMemberController
extends BaseAdminSimpleRestController<FunctionMemberResource, FunctionMember> {

	@Value("${coreapi.framework.rest.base-path}")
	private String basePath;
	@Value("${coreapi.framework.simple.rest.base-path}")
	private String baseSimplePath;
	@Value("${coreapi.framework.audit.rest.base-path}")
	private String baseAuditPath;

	@Autowired
	private FunctionMemberRestTemplateController functionMemberControllerRestTemplate;

	/**
	 * Find all entries.
	 * 
	 * @return Iterable<T> entries.
	 * 
	 * @throws NotFoundEntityException
	 */
	@GetMapping(produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.FOUND)
	public Iterable<FunctionMemberResource> findAll() throws NotFoundEntityException {
		LoggerUtil.message(LogMessageLevel.INFO, "BaseAdminSimpleRestController::findAll Finding all entries");

		final UriComponents url = UriComponentsBuilder.fromHttpUrl(basePath)
				.path("/" + CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER).build();

		final Iterable<FunctionMemberResource> result = getRestTemplateController().findAll(url.toString());

		LoggerUtil.message(LogMessageLevel.INFO, "BaseAdminSimpleRestController::findAll Result -> {}", result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleRestTemplateController<FunctionMemberResource, FunctionMember> getRestTemplateController() {
		return functionMemberControllerRestTemplate;
	}
}
