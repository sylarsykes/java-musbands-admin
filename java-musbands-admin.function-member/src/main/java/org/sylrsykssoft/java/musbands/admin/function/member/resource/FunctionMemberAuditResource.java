package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants;

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
@ApiModel(value = "Function Member Audit", description = "Function member resource auditable.", parent = BaseAdminAuditResource.class)
public class FunctionMemberAuditResource extends BaseAdminAuditResource {

	// Properties

	@ApiModelProperty(name = "synonyms", value = "List of function member synonims", dataType = "Set<FunctionMemberSynonymicSimpleResource>")
	@Singular
	Set<FunctionMemberSynonymicAuditResource> synonyms;

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param synonyms
	 * @param version
	 * @param createdBy
	 * @param createdDate
	 * @param lastModifiedBy
	 * @param lastModifiedDate
	 * 
	 * @see FunctionMemberConstants.RESOURCE_AUDIT_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberAuditResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "synonyms", "version", "createdBy", "createdDate",
		"lastModifiedBy", "lastModifiedDate" })
	public FunctionMemberAuditResource(final Integer entityId, final String name, final String description,
			final Set<FunctionMemberSynonymicAuditResource> synonyms,
			final Integer version, final String createdBy, final LocalDateTime createdDate, final String lastModifiedBy,
			final LocalDateTime lastModifiedDate) {
		super(entityId, name, description, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);

		this.synonyms = synonyms;
	}
}
