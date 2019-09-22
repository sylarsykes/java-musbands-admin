package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;

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
 * DTO FunctionMember
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true, exclude = "synonyms")
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberResource extends BaseAdminResource {

	// Properties

	@Singular
	Set<FunctionMemberSynonymicResource> synonyms;

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param synonyms
	 * 
	 * @see FunctionMemberConstants.RESOURCE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "synonyms" })
	public FunctionMemberResource(final Integer entityId, final String name, final String description,
			final Set<FunctionMemberSynonymicResource> synonyms) {
		super(entityId, name, description);

		this.synonyms = synonyms;
	}
}
