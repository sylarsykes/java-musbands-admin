package org.sylrsykssoft.java.musbands.admin.musical.genre.resource;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminSimpleResource;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO BaseAdminSimple
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@ApiModel(value = "MusicalGenreSimpleResource", description = "Musical genre simple resource.", parent = BaseAdminSimpleResource.class)
public class MusicalGenreSimpleResource extends BaseAdminSimpleResource {

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * 
	 * @see MusicalGenreConstants.RESOURCE_SIMPLE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "musicalGenreSimpleResourceBuilder")
	@ConstructorProperties({ "entityId", "name" })
	public MusicalGenreSimpleResource(final Integer entityId, final String name) {
		super(entityId, name);
	}

}
