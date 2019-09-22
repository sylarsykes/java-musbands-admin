package org.sylrsykssoft.java.musbands.admin.function.member.repository;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.REPOSITORY_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.REPOSITORY_AUDIT_REST_RESOURCE_PATH;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminAuditRepository;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;

/**
 * FunctionMember Rest Repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_AUDIT_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_AUDIT_REST_RESOURCE_PATH)
@Transactional(readOnly = true)
public interface FunctionMemberAuditRepository extends BaseAdminAuditRepository<FunctionMember> {

}
