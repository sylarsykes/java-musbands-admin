package org.sylrsykssoft.java.musbands.admin.instrument.repository;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_NAME;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_REST_COLLECTION_RESOURCE_REL;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.REPOSITORY_REST_RESOURCE_PATH;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.sylrsykssoft.coreapi.framework.database.repository.BaseAdminRepository;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;

/**
 * Instrument Rest Repository
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Repository(REPOSITORY_NAME)
@RepositoryRestResource(collectionResourceRel = REPOSITORY_REST_COLLECTION_RESOURCE_REL, path = REPOSITORY_REST_RESOURCE_PATH)
@Transactional
public interface InstrumentRepository extends BaseAdminRepository<Instrument> {

	/**
	 * Find by name.
	 * 
	 * @param name Value of the attribute name
	 * 
	 * @return T entity.
	 */
	@Query("select e from #{#entityName} e where e.name = :name and e.removedAt IS NULL")
	Optional<Instrument> findByName(final String name);
}
