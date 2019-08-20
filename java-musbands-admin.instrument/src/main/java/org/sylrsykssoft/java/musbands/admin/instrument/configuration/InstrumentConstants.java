package org.sylrsykssoft.java.musbands.admin.instrument.configuration;

/**
 * instrumentConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class InstrumentConstants {
	// CACHE //
	public static final String CACHE_NAME = "${musbands.admin.cache.cache-name}";
	public static final String CACHE_MANGER_BEAN_NAME = "${musbands.admin.cache.cache-manager}";

	// CONTROLLER //
	public static final String CONTROLLER_NAME = "instrumentController";
	public static final String CONTROLLER_TEST_NAME = "instrumentControllerTest";
	public static final String CONTROLLER_REQUEST_MAPPING_BASE_PATH = "${spring.data.rest.base-path}";
	public static final String CONTROLLER_REQUEST_NAME = "instruments";
	public static final String CONTROLLER_REQUEST_MAPPING = CONTROLLER_REQUEST_MAPPING_BASE_PATH + "/" + CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_REQUEST_MAPPING_BASE_PATH_TEST = "/admin";
	public static final String CONTROLLER_REQUEST_MAPPING_TEST = CONTROLLER_REQUEST_MAPPING_BASE_PATH_TEST + "/"
			+ CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_GET_FIND_BY_ID = "/findOne/id/{id}";
	public static final String CONTROLLER_GET_FIND_BY_NAME_MAPPING = "/findOne/name/{name}";
	public static final String CONTROLLER_GET_FIND_BY_EXAMPLE = "/findOne/example";
	public static final String CONTROLLER_GET_FIND_ALL_BY_EXAMPLE = "/findAll/example";
	public static final String CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE = "/findAll/example/sort";
	public static final String CONTROLLER_PUT_UPDATE = "/{id}";
	public static final String CONTROLLER_DELETE_DELETE = "/{id}";

	// MAPPER //
	public static final String MAPPER_RESOURCE_FUNCTION = "instrumentMapperToResourceFunction";
	public static final String MAPPER_RESOURCE_ASSEMBLER = "instrumentResourceAssembler";
	public static final String MAPPER_ENTITY_FUNCTION = "instrumentMapperToEntityFunction";

	// REPOSITORY //
	public static final String REPOSITORY_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_MAPPING;
	public static final String REPOSITORY_REST_RESOURCE_PATH = CONTROLLER_REQUEST_MAPPING;
	public static final String REPOSITORY_NAME = "instrumentRepository";
	public static final String REPOSITORY_TABLE_NAME = "instrument";
	public static final String REPOSITORY_ENTITY_NAME = "instrument";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "instrumentResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "instrumentResourceAssembler";


	// SERVICE //
	public static final String SERVICE_NAME = "instrumentService";


	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>InstrumentConstants.EMPTY_STRING</tt>, and so on. Thus, the caller should
	 * be prevented from constructing objects of this class, by declaring this
	 * private constructor.
	 */
	private InstrumentConstants() {
		throw new AssertionError();
	}

}
