package org.sylrsykssoft.java.musbands.admin.musical.genre.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
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
public class MusicalGenreSimpleResource extends BaseAdminResource {

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
	@ConstructorProperties({ "entityId", "name", "description", "createdAt", "updatedAt", "removeAt" })
	public MusicalGenreSimpleResource(final Integer entityId, final String name, final String description,
			final LocalDateTime createdAt, final LocalDateTime updatedAt, final LocalDateTime removedAt) {
		super(entityId, name, description, createdAt, updatedAt, removedAt);
	}

}