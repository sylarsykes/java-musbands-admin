package org.sylrsykssoft.java.musbands.admin.function.member.service;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.SERVICE_AUDIT_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminSimpleAuditRepository;
import org.sylrsykssoft.coreapi.framework.audit.service.BaseAdminSimpleAuditService;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMemberSynonymicSimple;
import org.sylrsykssoft.java.musbands.admin.function.member.repository.FunctionMemberSynonymicAuditRepository;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicAuditResource;

/**
 * FunctionMemberService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_AUDIT_NAME)
public class FunctionMemberSynonymicAuditService
extends BaseAdminSimpleAuditService<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> {

	@Autowired
	private FunctionMemberSynonymicAuditRepository functionMemberRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	private ResourceAssemblerSupport<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> functionMemberMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_ENTITY_FUNCTION)
	private ModelMapperFunction<FunctionMemberSynonymicAuditResource, FunctionMemberSynonymicSimple> functionMemberMapperToEntity;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminSimpleAuditRepository<FunctionMemberSynonymicSimple> getAdminRepository() {
		return functionMemberRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<FunctionMemberSynonymicAuditResource, FunctionMemberSynonymicSimple> mapperToEntity() {
		return functionMemberMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<FunctionMemberSynonymicSimple, FunctionMemberSynonymicAuditResource> mapperToResource() {
		return functionMemberMapperToResource;
	}

}