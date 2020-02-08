package org.sylrsykssoft.java.musbands.admin.users.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.userdetails.UserDetails;
import org.sylrsykssoft.coreapi.framework.security.resource.BaseUserResource;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/***
 * Users entity
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class MusbandsAdminUserResource extends BaseUserResource<Long> implements UserDetails {

	private static final long serialVersionUID = -935301999126911358L;

	String name;
	String surname;

	@Singular
	Set<MusbandsAdminAuthorityResource> authorities;

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param surname
	 * @param username
	 * @param password
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param createDateTime
	 * @param updateDateTime
	 * @param lastOnline
	 * @param authorities
	 * 
	 * @see org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_BUILDER_NAME
	 */
	@Builder(builderMethodName = "musbandsAdminUsersResourceBuilder")
	@ConstructorProperties({ "entityId", "username", "password", "enabled", "accountNonExpired",
		"credentialsNonExpired", "accountNonLocked", "createDateTime", "updateDateTime", "lastOnline", "authorities" })
	public MusbandsAdminUserResource(final Long entityId, final String name, final String surname, final String username, final String password, final boolean enabled,
			final boolean accountNonExpired, final boolean credentialsNonExpired, final boolean accountNonLocked,
			final LocalDateTime createDateTime, final LocalDateTime updateDateTime, final LocalDateTime lastOnline,
			final Collection<MusbandsAdminAuthorityResource> authorities) {
		super(entityId, username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
				createDateTime, updateDateTime, lastOnline);

		this.name = name;
		this.surname = surname;
		this.authorities = Collections.unmodifiableSet(authorities.stream().collect(Collectors.toSet()));
	}

}
