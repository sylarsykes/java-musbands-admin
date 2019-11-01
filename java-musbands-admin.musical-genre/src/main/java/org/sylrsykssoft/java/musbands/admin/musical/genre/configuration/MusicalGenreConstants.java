package org.sylrsykssoft.java.musbands.admin.musical.genre.configuration;

import static org.sylrsykssoft.coreapi.framework.audit.configuration.BaseAdminAuditConstants.CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH;

/**
 * MusicalGenreConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class MusicalGenreConstants {
	// CACHE //
	public static final String CACHE_NAME = "${musbands.admin.cache.cache-name}";
	public static final String CACHE_MANGER_BEAN_NAME = "${musbands.admin.cache.cache-manager}";

	// CONTROLLER //
	public static final String CONTROLLER_REQUEST_NAME = "musicalGenres";
	public static final String CONTROLLER_NAME = "musicalGenreController";
	public static final String CONTROLLER_TEST_NAME = "musicalGenreControllerTest";
	public static final String CONTROLLER_SIMPLE_NAME = "musicalGenreSimpleController";
	public static final String CONTROLLER_AUDIT_NAME = "musicalGenreAuditController";

	// CONTROLLER PATH //
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING = CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH + "/"
			+ CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING = CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH + "/"
			+ CONTROLLER_REQUEST_NAME;
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
	public static final String MAPPER_RESOURCE_FUNCTION = "musicalGenreMapperToResourceFunction";
	public static final String MAPPER_RESOURCE_ASSEMBLER = "musicalGenreResourceAssembler";
	public static final String MAPPER_ENTITY_FUNCTION = "musicalGenreMapperToEntityFunction";
	public static final String MAPPER_AUDIT_ENTITY_FUNCTION = "musicalGenreAuditMapperToEntityFunction";
	public static final String MAPPER_AUDIT_RESOURCE_FUNCTION = "musicalGenreAuditMapperToResourceFunction";
	public static final String MAPPER_AUDIT_RESOURCE_ASSEMBLER = "musicalGenreAuditResourceAssembler";
	public static final String MAPPER_SIMPLE_ENTITY_FUNCTION = "musicalGenreSimpleMapperToEntityFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_FUNCTION = "musicalGenreSimpleMapperToResourceFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_ASSEMBLER = "musicalGenreSimpleResourceAssembler";

	// REPOSITORY //
	public static final String REPOSITORY_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_NAME = "musicalGenreRepository";
	public static final String REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_NAME = "musicalGenreAuditRepository";
	public static final String REPOSITORY_SIMPLE_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_NAME = "musicalGenreSimpleRepository";
	public static final String REPOSITORY_TABLE_NAME = "musical_genre";
	public static final String REPOSITORY_ENTITY_NAME = "musicalGenre";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "musicalGenreResourceBuilder";
	public static final String RESOURCE_AUDIT_BUILDER_NAME = "musicalGenreAuditResourceBuilder";
	public static final String RESOURCE_SIMPLE_BUILDER_NAME = "musicalGenreSimpleResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "musicalGenreResourceAssembler";
	public static final String MAILTO_BUILDER_NAME = "musicalGenreMailTOBuilder";


	// SERVICE //
	public static final String SERVICE_NAME = "musicalGenreService";
	public static final String SERVICE_SIMPLE_NAME = "musicalGenreSimpleService";
	public static final String SERVICE_AUDIT_NAME = "musicalGenreAuditService";
	public static final String CREATE_MAIL_SERVICE_NAME = "createMusicalGenreMailAdminService";


	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>MusicalGenreConstants.EMPTY_STRING</tt>, and so on. Thus, the caller
	 * should be prevented from constructing objects of this class, by declaring
	 * this private constructor.
	 */
	private MusicalGenreConstants() {
		throw new AssertionError();
	}

}
