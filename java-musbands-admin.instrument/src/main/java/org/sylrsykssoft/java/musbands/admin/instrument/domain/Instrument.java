package org.sylrsykssoft.java.musbands.admin.instrument.domain;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_TABLE_NAME;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
import org.sylrsykssoft.coreapi.framework.database.model.listener.BaseListener;

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
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@EntityListeners({BaseListener.class})
public class Instrument extends BaseAdmin {

	/**
	 * InstrumentBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class InstrumentBuilder extends BaseAdminBuilder<Instrument, InstrumentBuilder> {
		/**
		 * {inheritDoc}
		 */
		@Override
		protected InstrumentBuilder self() {
			return this;
		}

	}
}
