package org.sylrsykssoft.java.musbands.admin.instrument.domain;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_TABLE_NAME;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.sylrsykssoft.coreapi.framework.api.model.Base;
import org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
import org.sylrsykssoft.coreapi.framework.api.model.BaseAdminSimple;
import org.sylrsykssoft.coreapi.framework.audit.domain.BaseAdminAudit;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Entity instrument
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@Audited
@AuditOverrides(value = { @AuditOverride(forClass = BaseAdminAudit.class, isAudited = true),
		@AuditOverride(forClass = BaseAdmin.class, isAudited = true),
		@AuditOverride(forClass = BaseAdminSimple.class, isAudited = true),
		@AuditOverride(forClass = Base.class, isAudited = true) })
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@EntityListeners({ AuditingEntityListener.class })
public class Instrument extends BaseAdminAudit {

	/**
	 * InstrumentBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class InstrumentBuilder extends BaseAdminAuditBuilder<Instrument, InstrumentBuilder> {
		/**
		 * {inheritDoc}
		 */
		@Override
		protected InstrumentBuilder self() {
			return this;
		}

	}
}
