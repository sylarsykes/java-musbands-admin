package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * DTO FunctionMemberSynonymic
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true, exclude = "functionMembers")
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberSynonymicResource extends BaseAdminResource {

	// Properties

	@Singular
	Set<FunctionMember> functionMembers;

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param functionMembers
	 * 
	 * @see FunctionMemberSynonymicConstants.RESOURCE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberSynonymicResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "functionMembers" })
	public FunctionMemberSynonymicResource(final Integer entityId, final String name, final String description,
			final Set<FunctionMember> functionMembers) {
		super(entityId, name, description);

		this.functionMembers = functionMembers;
	}
}
