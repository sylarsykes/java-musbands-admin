package org.sylrsykssoft.java.musbands.admin.instrument.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;

import org.sylrsykssoft.coreapi.framework.audit.resource.BaseAdminAuditResource;
import org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants;

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
public class InstrumentAuditResource extends BaseAdminAuditResource {

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param description
	 * @param createdAt
	 * @param updatedAt
	 * 
	 * @see InstrumentConstants.RESOURCE_AUDIT_BUILDER_NAME
	 */
	@Builder(builderMethodName = "instrumentAuditResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "version", "createdBy", "createdDate", "lastModifiedBy",
	"lastModifiedDate" })
	public InstrumentAuditResource(final Integer entityId, final String name, final String description,
			final Integer version, final String createdBy,
			final LocalDateTime createdDate, final String lastModifiedBy, final LocalDateTime lastModifiedDate) {
		super(entityId, name, description, version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
	}
}
