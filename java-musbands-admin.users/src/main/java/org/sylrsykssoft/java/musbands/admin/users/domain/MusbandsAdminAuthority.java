package org.sylrsykssoft.java.musbands.admin.users.domain;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.REPOSITORY_AUTHORITY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUserConstants.REPOSITORY_AUTHORITY_TABLE_NAME;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.sylrsykssoft.coreapi.framework.security.domain.BaseAuthority;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/***
 * Authorities entity
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Table(name = REPOSITORY_AUTHORITY_TABLE_NAME)
@Entity(name = REPOSITORY_AUTHORITY_ENTITY_NAME)
@Data
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class MusbandsAdminAuthority extends BaseAuthority<Long> {

	// Builder
	/**
	 * MusbandsAdminUserBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class MusbandsAdminAuthorityBuilder
	extends BaseAuthority.BaseAuthorityBuilder<Long, MusbandsAdminAuthority, MusbandsAdminAuthorityBuilder> {

		/**
		 * {inheritDoc}
		 */
		@Override
		protected MusbandsAdminAuthorityBuilder self() {
			return this;
		}

	}

	@ManyToMany(mappedBy = "authorities")
	@Singular
	Set<MusbandsAdminUser> users;

}
