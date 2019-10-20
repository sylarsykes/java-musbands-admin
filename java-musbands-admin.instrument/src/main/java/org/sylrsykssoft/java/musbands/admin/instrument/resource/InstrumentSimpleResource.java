package org.sylrsykssoft.java.musbands.admin.instrument.resource;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminSimpleResource;
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
@ApiModel(value = "InstrumentSimpleResource", description = "Instrument simple resource.", parent = BaseAdminSimpleResource.class)
public class InstrumentSimpleResource extends BaseAdminSimpleResource {

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * 
	 * @see InstrumentConstants.RESOURCE_SIMPLE_BUILDER_NAME
	 */
	@Builder(builderMethodName = "instrumentSimpleResourceBuilder")
	public InstrumentSimpleResource(final Integer entityId, final String name) {
		super(entityId, name);
	}
}
