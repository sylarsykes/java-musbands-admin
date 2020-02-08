package org.sylrsykssoft.java.musbands.admin.users.resource;

import java.beans.ConstructorProperties;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.security.configuration.CoreApiFrameworkSecurityConstants.AuthorityType;
import org.sylrsykssoft.coreapi.framework.security.resource.BaseAuthorityResource;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Authority entity base.
 * 
 * @author juan.gonzalez.fernandez.jgf
 * 
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class MusbandsAdminAuthorityResource extends BaseAuthorityResource<Long> {

	private static final long serialVersionUID = 3750647982652124392L;

	@Singular
	Set<MusbandsAdminUserResource> users;

	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param authority
	 * @param users
	 * 
	 * 
	 */
	@Builder(builderMethodName = "musbandsAdminAuthorityResourceBuilder")
	@ConstructorProperties({ "entityId", "authority" })
	public MusbandsAdminAuthorityResource(final Long entityId, final AuthorityType authority,
			final Set<MusbandsAdminUserResource> users) {
		super(entityId, authority);

		this.users = users;
	}
}
