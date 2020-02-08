package org.sylrsykssoft.java.musbands.admin.users.domain;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_TABLE_NAME;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.lang.Nullable;
import org.sylrsykssoft.coreapi.framework.security.domain.BaseUser;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/***
 * Users entity
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@Data
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class MusbandsAdminUser extends BaseUser<Long> {

	// Builder
	/**
	 * MusbandsAdminUserBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class MusbandsAdminUserBuilder
			extends BaseUser.BaseUserBuilder<Long, MusbandsAdminUser, MusbandsAdminUserBuilder> {

		/**
		 * {inheritDoc}
		 */
		@Override
		protected MusbandsAdminUserBuilder self() {
			return this;
		}

	}

	public static final int MAX_LENGTH_NAME = 30;
	public static final int MAX_LENGTH_SURNAME = 256;

	@Column(name = "name", nullable = false, length = MAX_LENGTH_NAME)
	@NonNull
	String name;

	@Column(name = "surname", nullable = true, length = MAX_LENGTH_SURNAME)
	@Nullable
	String surname;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "musbands_admin_user_authorities", joinColumns = {
			@JoinColumn(name = "musbands_admin_user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "authority_id", referencedColumnName = "id") })
	@Fetch(value = FetchMode.SELECT)
	@Singular
	Set<MusbandsAdminAuthority> authorities;

}
