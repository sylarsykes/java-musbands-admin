package org.sylrsykssoft.java.musbands.admin.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.sylrsykssoft.coreapi.framework.security.controller.BaseUserController;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;
import org.sylrsykssoft.java.musbands.admin.users.resource.MusbandsAdminUserResource;
import org.sylrsykssoft.java.musbands.admin.users.service.MusbandsAdminUsersUserDetailService;

/**
 * MusbandsAdminUserController
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
public class MusbandsAdminUserController
		extends BaseUserController<MusbandsAdminUserResource, MusbandsAdminUser, Long> {

	@Autowired
	private MusbandsAdminUsersUserDetailService musbandsAdminUserDetailService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MusbandsAdminUsersUserDetailService getUserDetailService() {
		return musbandsAdminUserDetailService;
	}

}
