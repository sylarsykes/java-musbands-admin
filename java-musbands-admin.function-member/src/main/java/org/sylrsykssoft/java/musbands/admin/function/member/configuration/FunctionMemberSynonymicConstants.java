package org.sylrsykssoft.java.musbands.admin.function.member.configuration;

/**
 * FunctionMemberConstants
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public final class FunctionMemberSynonymicConstants {
	// REPOSITORY //
	public static final String REPOSITORY_NAME = "functionMemberSynonymicRepository";
	public static final String REPOSITORY_TABLE_NAME = "function_member_synonymic";
	public static final String REPOSITORY_ENTITY_NAME = "functionMemberSynonymic";

	// RESOURCE //
	public static final String RESOURCE_BUILDER_NAME = "functionMemberSynonymicResourceBuilder";
	public static final String RESOURCE_ASSEMBLER_NAME = "functionMemberSynonymicResourceAssembler";

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
