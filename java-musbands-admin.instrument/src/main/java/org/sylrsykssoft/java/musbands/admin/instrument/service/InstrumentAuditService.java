package org.sylrsykssoft.java.musbands.admin.instrument.service;

import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_ENTITY_FUNCTION;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.MAPPER_AUDIT_RESOURCE_ASSEMBLER;
import static org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentConstants.SERVICE_AUDIT_NAME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Service;
import org.sylrsykssoft.coreapi.framework.audit.repository.BaseAdminAuditRepository;
import org.sylrsykssoft.coreapi.framework.audit.service.BaseAdminAuditService;
import org.sylrsykssoft.coreapi.framework.library.mapper.ModelMapperFunction;
import org.sylrsykssoft.java.musbands.admin.instrument.domain.Instrument;
import org.sylrsykssoft.java.musbands.admin.instrument.repository.InstrumentAuditRepository;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentAuditResource;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.assembler.InstrumentAuditResourceAssembler;

/**
 * InstrumentService service.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Service(SERVICE_AUDIT_NAME)
public class InstrumentAuditService extends BaseAdminAuditService<Instrument, InstrumentAuditResource> {

	@Autowired
	private InstrumentAuditRepository instrumentRepository;

	/** Mapper resource bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_RESOURCE_ASSEMBLER)
	private InstrumentAuditResourceAssembler instrumentMapperToResource;

	/** Mapper entity bean */
	@Autowired
	@Qualifier(MAPPER_AUDIT_ENTITY_FUNCTION)
	private ModelMapperFunction<InstrumentAuditResource, Instrument> instrumentMapperToEntity;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BaseAdminAuditRepository<Instrument> getAdminRepository() {
		return instrumentRepository;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelMapperFunction<InstrumentAuditResource, Instrument> mapperToEntity() {
		return instrumentMapperToEntity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResourceAssemblerSupport<Instrument, InstrumentAuditResource> mapperToResource() {
		return instrumentMapperToResource;
	}

}