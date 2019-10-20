package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminSimpleAuditResource;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants;

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
@ApiModel(value = "FunctionMemberSynonymicAuditResource", description = "Function member synonimic resource auditable.", parent = BaseAdminAuditResource.class)
public class FunctionMemberSynonymicAuditResource extends BaseAdminSimpleAuditResource {

	// Properties

	@ApiModelProperty(name = "functionMembers", value = "List of function members", dataType = "Set<FunctionMemberAuditResource>")
	@Singular
	Set<FunctionMemberAuditResource> functionMembers;

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param functionMembers
	 * @param version
	 * @param createdBy
	 * @param createdDate
	 * @param lastModifiedBy
	 * @param lastModifiedDate
	 * 
	 * @see FunctionMemberSynonymicConstants.RESOURCE_AUDIT_BUILDER_NAME
	 */
	@Builder(builderMethodName = "functionMemberSynonymicAuditResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "functionMembers", "version", "createdBy",
		"createdDate", "lastModifiedBy", "lastModifiedDate" })
	public FunctionMemberSynonymicAuditResource(final Integer entityId, final String name,
			final Set<FunctionMemberAuditResource> functionMembers, final Integer version, final String createdBy,
			final LocalDateTime createdDate, final String lastModifiedBy,
			final LocalDateTime lastModifiedDate) {
		super(entityId, name, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);

		this.functionMembers = functionMembers;
	}
}
