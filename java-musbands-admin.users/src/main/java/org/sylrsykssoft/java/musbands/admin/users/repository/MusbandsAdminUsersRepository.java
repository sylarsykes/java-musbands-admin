package org.sylrsykssoft.java.musbands.admin.users.repository;

import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_NAME;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.users.configuration.MusbandsAdminUsersConstants.REPOSITORY_REST_RESOURCE_PATH;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sylrsykssoft.coreapi.framework.security.repository.BaseUserRepository;
import org.sylrsykssoft.java.musbands.admin.users.domain.MusbandsAdminUser;

/**
 * MusbandsAdminUsersRepository rest repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_REST_RESOURCE_PATH)
@Transactional(readOnly = true)
public interface MusbandsAdminUsersRepository extends BaseUserRepository<MusbandsAdminUser, Long> {

}
