package org.sylrsykssoft.java.musbands.admin.application.test.configuration;

/**
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class MusbandsAdminTestConstants {

	// CONTROLLER //
	public static final String CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER = "functionMembers";
	public static final String CONTROLLER_REQUEST_NAME_INSTRUMENT = "instrument";
	public static final String CONTROLLER_REQUEST_NAME_MUSICAL_GENRE = "musicalGenres";

	// CONTROLLER BASE PATH //
	public static final String CONTROLLER_REQUEST_MAPPING_BASE_PATH = "${spring.data.rest.base-path}";

	public static final String CONTROLLER_TEST_ADMIN_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.test.admin.rest.base-path}";
	public static final String CONTROLLER_TEST_SIMPLE_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.test.simple.rest.base-path}";
	public static final String CONTROLLER_TEST_AUDIT_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.test.audit.rest.base-path}";

	public static final String CONTROLLER_ADMIN_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.rest.base-path}";
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.simple.rest.base-path}";
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING_BASE_PATH = "${coreapi.framework.audit.rest.base-path}";

	// CONTROLLER PATH //

	// FUNCTION MEMBER //
	public static final String CONTROLLER_ADMIN_REQUEST_MAPPING_FUNCTION_MEMBER = CONTROLLER_TEST_ADMIN_REQUEST_MAPPING_BASE_PATH
			+ "/"
			+ CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER;
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING_FUNCTION_MEMBER = CONTROLLER_TEST_SIMPLE_REQUEST_MAPPING_BASE_PATH
			+ "/"
			+ CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER;
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING_FUNCTION_MEMBER = CONTROLLER_TEST_AUDIT_REQUEST_MAPPING_BASE_PATH
			+ "/"
			+ CONTROLLER_REQUEST_NAME_FUNCTION_MEMBER;

	// INSTRUMENT //
	public static final String CONTROLLER_ADMIN_REQUEST_MAPPING_INSTRUMENT = CONTROLLER_TEST_ADMIN_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_INSTRUMENT;
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING_INSTRUMENT = CONTROLLER_TEST_SIMPLE_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_INSTRUMENT;
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING_INSTRUMENT = CONTROLLER_TEST_AUDIT_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_INSTRUMENT;

	// MUSICAL GENRE //
	public static final String CONTROLLER_ADMIN_REQUEST_MAPPING_MUSICAL_GENRE = CONTROLLER_TEST_ADMIN_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_MUSICAL_GENRE;
	public static final String CONTROLLER_SIMPLE_REQUEST_MAPPING_MUSICAL_GENRE = CONTROLLER_TEST_SIMPLE_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_MUSICAL_GENRE;
	public static final String CONTROLLER_AUDIT_REQUEST_MAPPING_MUSICAL_GENRE = CONTROLLER_TEST_AUDIT_REQUEST_MAPPING_BASE_PATH
			+ "/" + CONTROLLER_REQUEST_NAME_MUSICAL_GENRE;


	// PRIVATE //
	/**
	 * The caller references the constants using
	 * <tt>FunctionMemberConstants.EMPTY_STRING</tt>, and so on. Thus, the caller
	 * should be prevented from constructing objects of this class, by declaring
	 * this private constructor.
	 */
	private MusbandsAdminTestConstants() {
		throw new AssertionError();
	}

}
