package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
@ApiModel(value = "Function Member", description = "Function member resource.", parent = BaseAdminResource.class)
public class FunctionMemberResource extends BaseAdminResource {

	// Properties

	@ApiModelProperty(name = "synonyms", value = "List of function member synonims", dataType = "Set<FunctionMemberSynonymicSimpleResource>")
	@Singular
	Set<FunctionMemberSynonymicSimpleResource> synonyms;

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
			final Set<FunctionMemberSynonymicSimpleResource> synonyms) {
		super(entityId, name, description);

		this.synonyms = synonyms;
	}
}
