package org.sylrsykssoft.java.musbands.admin.function.member.service;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.SERVICE_AUDIT_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminAuditRepository;
import org.sylrsykssoft.coreapi.framework.audit.service.BaseAdminAuditService;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;
import org.sylrsykssoft.java.musbands.admin.function.member.repository.FunctionMemberAuditRepository;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberAuditResource;

/**
 * FunctionMemberService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_AUDIT_NAME)
public class FunctionMemberAuditService extends BaseAdminAuditService<FunctionMember, FunctionMemberAuditResource> {

	@Autowired
	private FunctionMemberAuditRepository functionMemberRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	private ResourceAssemblerSupport<FunctionMember, FunctionMemberAuditResource> functionMemberMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_ENTITY_FUNCTION)
	private ModelMapperFunction<FunctionMemberAuditResource, FunctionMember> functionMemberMapperToEntity;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminAuditRepository<FunctionMember> getAdminRepository() {
		return functionMemberRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberAuditResource, FunctionMember> mapperToEntity() {
		return functionMemberMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<FunctionMember, FunctionMemberAuditResource> mapperToResource() {
		return functionMemberMapperToResource;
	}

}