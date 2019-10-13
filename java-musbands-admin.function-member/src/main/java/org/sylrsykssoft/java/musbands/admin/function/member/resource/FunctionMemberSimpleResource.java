package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminSimpleResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@ApiModel(value = "Function Member Simple", description = "Simple resource to show as a simple fact.", parent = BaseAdminSimpleResource.class)
public class FunctionMemberSimpleResource extends BaseAdminSimpleResource {

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * 
	 * @see FunctionMemberConstants.RESOURCE_SIMPLE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberSimpleResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "synonyms" })
	public FunctionMemberSimpleResource(final Integer entityId, final String name) {
		super(entityId, name);
	}
}
