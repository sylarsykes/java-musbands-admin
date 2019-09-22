package org.sylrsykssoft.java.musbands.admin.musical.genre.repository;

import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_NAME;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.REPOSITORY_REST_RESOURCE_PATH;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
import org.sylrsykssoft.java.musbands.admin.musical.genre.domain.MusicalGenre;

/**
 * MusicalGenre rest repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_REST_RESOURCE_PATH)
@Transactional
public interface MusicalGenreRepository extends BaseAdminRepository<MusicalGenre> {

}
