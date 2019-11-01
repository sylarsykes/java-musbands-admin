package org.sylrsykssoft.java.musbands.admin.function.member.configuration;

import static org.sylrsykssoft.coreapi.framework.audit.configuration.BaseAdminAuditConstants.CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_REQUEST_MAPPING_BASE_PATH;
import static org.sylrsykssoft.coreapi.framework.web.configuration.BaseAdminConstants.CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH;

/**
 * FunctionMemberConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class FunctionMemberSynonymicConstants {
	// CACHE //
	public static final String CACHE_NAME = "${musbands.admin.cache.cache-name}";
	public static final String CACHE_MANGER_BEAN_NAME = "${musbands.admin.cache.cache-manager}";

	// CONTROLLER //
	public static final String CONTROLLER_REQUEST_NAME = "functionMemberSynonymics";
	public static final String CONTROLLER_NAME = "functionMemberSynonymicController";
	public static final String CONTROLLER_TEST_NAME = "functionMemberSynonymicControllerTest";
	public static final String CONTROLLER_SIMPLE_NAME = "functionMemberSynonymicSimpleController";
	public static final String CONTROLLER_AUDIT_NAME = "functionMemberSynonymicAuditController";

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
	public static final String MAPPER_AUDIT_ENTITY_FUNCTION = "functionMemberSynonymicAuditMapperToEntityFunction";
	public static final String MAPPER_AUDIT_RESOURCE_FUNCTION = "functionMemberSynonymicAuditMapperToResourceFunction";
	public static final String MAPPER_AUDIT_RESOURCE_ASSEMBLER = "functionMemberSynonymicAuditResourceAssembler";
	public static final String MAPPER_SIMPLE_ENTITY_FUNCTION = "functionMemberSynonymicSimpleMapperToEntityFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_FUNCTION = "functionMemberSynonymicSimpleMapperToResourceFunction";
	public static final String MAPPER_SIMPLE_RESOURCE_ASSEMBLER = "functionMemberSynonymicSimpleResourceAssembler";

	// REPOSITORY //
	public static final String REPOSITORY_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_NAME = "functionMemberSynonymicRepository";
	public static final String REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_AUDIT_NAME = "functionMemberSynonymicAuditRepository";
	public static final String REPOSITORY_SIMPLE_REST_COLLECTION_RESOURCE_REL = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_REST_RESOURCE_PATH = CONTROLLER_REQUEST_NAME;
	public static final String REPOSITORY_SIMPLE_NAME = "functionMemberSynonymicSimpleRepository";
	public static final String REPOSITORY_TABLE_NAME = "function_member_synonymic";
	public static final String REPOSITORY_ENTITY_NAME = "functionMemberSynonymic";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "functionMemberSynonymicResourceBuilder";
	public static final String RESOURCE_AUDIT_BUILDER_NAME = "functionMemberSynonymicAuditResourceBuilder";
	public static final String RESOURCE_SIMPLE_BUILDER_NAME = "functionMemberSynonymicSimpleResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "functionMemberSynonymicResourceAssembler";
	public static final String MAILTO_BUILDER_NAME = "functionMemberSynonymicMailTOBuilder";

	// SERVICE //
	public static final String SERVICE_NAME = "functionMemberSynonymicService";
	public static final String SERVICE_AUDIT_NAME = "functionMemberSynonymicAuditService";
	public static final String SERVICE_SIMPLE_NAME = "functionMemberSynonymicSimpleService";

	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>FunctionMemberConstants.EMPTY_STRING</tt>, and so on. Thus, the caller
	 * should be prevented from constructing objects of this class, by declaring
	 * this private constructor.
	 */
	private FunctionMemberSynonymicConstants() {
		throw new AssertionError();
	}

}
