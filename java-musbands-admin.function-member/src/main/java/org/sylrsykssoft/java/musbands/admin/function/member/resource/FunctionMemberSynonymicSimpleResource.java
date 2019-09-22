package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberSynonymicSimpleResource extends BaseAdminSimpleResource {

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 *
	 * @see FunctionMemberSynonymicConstants.RESOURCE_SIMPLE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberSynonymicSimpleResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "functionMembers" })
	public FunctionMemberSynonymicSimpleResource(final Integer entityId, final String name) {
		super(entityId, name);
	}
}
