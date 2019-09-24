package org.sylrsykssoft.java.musbands.admin.client;

import java.beans.ConstructorProperties;

import org.sylrsykssoft.coreapi.framework.web.rest.BaseAdminRestTemplateController;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;

/**
 * Function memeber Rest Controller Bean
 * 
 * @author juan.gonzalez.fernandez.jgf
 */
public class FunctionMemberRestTemplateController
		extends BaseAdminRestTemplateController<FunctionMemberResource, FunctionMember> {

	/**
	 * AllArgsConstructor
	 * 
	 * @param responseType
	 */
	@ConstructorProperties({ "responseType" })
	public FunctionMemberRestTemplateController(final Class<FunctionMemberResource> responseType) {
		super(responseType);
	}

}
