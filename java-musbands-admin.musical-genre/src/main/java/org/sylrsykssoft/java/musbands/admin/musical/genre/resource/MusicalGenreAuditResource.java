package org.sylrsykssoft.java.musbands.admin.musical.genre.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO BaseAdminAudit
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@ApiModel(value = "Musical Genre Audit", description = "Musical Genre audit resource auditable.", parent = BaseAdminAuditResource.class)
public class MusicalGenreAuditResource extends BaseAdminAuditResource {

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param createdAt
	 * @param updatedAt
	 * 
	 * @see MusicalGenreConstants.RESOURCE_AUDIT_BUILDER_NAME
	 */
	@Builder(builderMethodName = "musicalGenreAuditResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "version", "createdBy", "createdDate", "lastModifiedBy",
	"lastModifiedDate" })
	public MusicalGenreAuditResource(final Integer entityId, final String name, final String description,
			final Integer version, final String createdBy, final LocalDateTime createdDate, final String lastModifiedBy,
			final LocalDateTime lastModifiedDate) {
		super(entityId, name, description, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
	}
}
