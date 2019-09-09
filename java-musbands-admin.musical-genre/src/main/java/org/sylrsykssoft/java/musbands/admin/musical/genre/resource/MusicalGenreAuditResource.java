package org.sylrsykssoft.java.musbands.admin.musical.genre.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO BaseAdmin
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
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
	 * @see MusicalGenreConstants.RESOURCE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "musicalGenreResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "version", "createdBy", "createdDate", "lastModifiedBy",
			"lastModifiedDate", "createdAt", "updatedAt", "removedAt" })
	public MusicalGenreAuditResource(final Integer entityId, final String name, final String description,
			final Integer version, final String createdBy, final LocalDateTime createdDate, final String lastModifiedBy,
			final LocalDateTime lastModifiedDate,
			final LocalDateTime createdAt, final LocalDateTime updatedAt, final LocalDateTime removedAt) {
		super(entityId, name, description, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate, createdAt,
				updatedAt, removedAt);
	}
}
