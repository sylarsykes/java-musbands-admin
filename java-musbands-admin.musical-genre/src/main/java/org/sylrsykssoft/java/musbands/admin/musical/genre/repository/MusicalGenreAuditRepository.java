package org.sylrsykssoft.java.musbands.admin.musical.genre.repository;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_AUDIT_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_AUDIT_REST_RESOURCE_PATH;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminAuditRepository;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;

/**
 * MusicalGenreAudit Repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_AUDIT_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_AUDIT_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_AUDIT_REST_RESOURCE_PATH)
@Transactional
public interface MusicalGenreAuditRepository extends BaseAdminAuditRepository<MusicalGenre> {

	/**
	 * Find by name.
	 * 
	 * @param name Value of the attribute name
	 * 
	 * @return T entity.
	 */
	@Override
	@Query("select e from #{#entityName} e where e.name = :name")
	Optional<MusicalGenre> findByName(final String name);
}
