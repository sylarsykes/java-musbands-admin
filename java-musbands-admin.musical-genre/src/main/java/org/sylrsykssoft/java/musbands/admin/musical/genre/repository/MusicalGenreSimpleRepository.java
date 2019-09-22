package org.sylrsykssoft.java.musbands.admin.musical.genre.repository;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_SIMPLE_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_SIMPLE_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_SIMPLE_REST_RESOURCE_PATH;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminSimpleRepository;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;

/**
 * MusicalGenre rest repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_SIMPLE_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_SIMPLE_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_SIMPLE_REST_RESOURCE_PATH)
@Transactional(readOnly = true)
public interface MusicalGenreSimpleRepository extends BaseAdminSimpleRepository<MusicalGenre> {

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
