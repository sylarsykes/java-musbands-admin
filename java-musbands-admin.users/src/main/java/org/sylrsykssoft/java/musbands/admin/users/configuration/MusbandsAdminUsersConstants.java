package org.sylrsykssoft.java.musbands.admin.users.configuration;

import static org.sylrsykssoft.coreapi.framework.audit.configuration.BaseAdminAuditConstants.CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH;

/**
 * MusbandsAdminUsersConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class MusbandsAdminUsersConstants {
	// CACHE //
	public static final String CACHE_NAME = "${musbands.admin.cache.cache-name}";
	public static final String CACHE_MANGER_BEAN_NAME = "${musbands.admin.cache.cache-manager}";

	// CONTROLLER //
	public static final String CONTROLLER_REQUEST_NAME = "musbandsAdminUsers";
	public static final String CONTROLLER_NAME = "musbandsAdminUsersController";
	public static final String CONTROLLER_TEST_NAME = "musbandsAdminUsersControllerTest";

	// CONTROLLER PATH //
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING = CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH + "/"
			+ CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING = CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH + "/"
			+ CONTROLLER_REQUEST_NAME;
	public static final String CONTROLLER_REQUEST_MAPPING = CONTROLLER_REQUEST_MAPPING_BASE_PATH + "/"
			+ CONTROLLER_REQUEST_NAME;
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
	public static final String MAPPER_RESOURCE_FUNCTION = "musbandsAdminUsersMapperToResourceFunction";
	public static final String MAPPER_RESOURCE_ASSEMBLER = "musbandsAdminUsersResourceAssembler";
	public static final String MAPPER_ENTITY_FUNCTION = "musbandsAdminUsersMapperToEntityFunction";

	// REPOSITORY //
	public static final String REPOSITORY_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_NAME = "musbandsAdminUsersRepository";
	public static final String REPOSITORY_TABLE_NAME = "musbands_admin_user";
	public static final String REPOSITORY_ENTITY_NAME = "musbandsAdminUser";
	public static final String REPOSITORY_BUILDER_NAME = "musbandsAdminUsersBuilder";
	public static final String REPOSITORY_AUTHORITY_TABLE_NAME = "musbands_admin_authority";
	public static final String REPOSITORY_AUTHORITY_ENTITY_NAME = "musbandsAdminAuthority";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "musbandsAdminUsersResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "musbandsAdminUsersResourceAssembler";
	public static final String MAILTO_BUILDER_NAME = "musbandsAdminUserMailTOBuilder";

	// SERVICE //
	public static final String SERVICE_NAME = "musbandsAdminUsersUserDetailService";

	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>FunctionMemberConstants.EMPTY_STRING</tt>, and so on. Thus, the caller
	 * should be prevented from constructing objects of this class, by declaring
	 * this private constructor.
	 */
	private MusbandsAdminUsersConstants() {
		throw new AssertionError();
	}

}
