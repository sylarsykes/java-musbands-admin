package org.sylrsykssoft.java.musbands.admin.application.test.function.member;

import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_ADMIN_REQUEST_MAPPING_INSTRUMENT;
import static org.sylrsykssoft.java.musbands.admin.application.test.configuration.MusbandsAdminTestConstants.CONTROLLER_REQUEST_NAME_INSTRUMENT;

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
import org.sylrsykssoft.java.musbands.admin.client.InstrumentRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;

/**
 * MusbandsAdminTestInstrumentController
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@RestController
@RequestMapping(CONTROLLER_ADMIN_REQUEST_MAPPING_INSTRUMENT)
public class MusbandsAdminTestInstrumentController
		extends BaseAdminSimpleRestController<InstrumentResource, Instrument> {

	@Value("${coreapi.framework.rest.base-path}")
	private String basePath;
	@Value("${coreapi.framework.simple.rest.base-path}")
	private String baseSimplePath;
	@Value("${coreapi.framework.audit.rest.base-path}")
	private String baseAuditPath;

	@Autowired
	private InstrumentRestTemplateController instrumentControllerRestTemplate;

	/**
	 * Find all entries.
	 * 
	 * @return Iterable<T> entries.
	 * 
	 * @throws NotFoundEntityException
	 */
	@GetMapping(produces = { MediaTypes.HAL_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	@ResponseStatus(HttpStatus.FOUND)
	public Iterable<InstrumentResource> findAll() throws NotFoundEntityException {
		LoggerUtil.message(LogMessageLevel.INFO, "MusbandsAdminTestInstrumentController::findAll Finding all entries");

		final UriComponents url = UriComponentsBuilder.fromHttpUrl(basePath)
				.path("/" + CONTROLLER_REQUEST_NAME_INSTRUMENT).build();

		final Iterable<InstrumentResource> result = getRestTemplateController().findAll(url.toString());

		LoggerUtil.message(LogMessageLevel.INFO, "MusbandsAdminTestInstrumentController::findAll Result -> {}", result);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleRestTemplateController<InstrumentResource, Instrument> getRestTemplateController() {
		return instrumentControllerRestTemplate;
	}
}
