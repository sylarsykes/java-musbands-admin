package org.sylrsykssoft.java.musbands.admin.instrument.resource;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
import org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants;

import io.swagger.annotations.ApiModel;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO Instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@ApiModel(value = "InstrumentResource", description = "Instrument resource.", parent = BaseAdminResource.class)
public class InstrumentResource extends BaseAdminResource {

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param createdAt
	 * @param updatedAt
	 * 
	 * @see InstrumentConstants.RESOURCE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "instrumentResourceBuilder")
	public InstrumentResource(final Integer entityId, final String name, final String description) {
		super(entityId, name, description);
	}
}
