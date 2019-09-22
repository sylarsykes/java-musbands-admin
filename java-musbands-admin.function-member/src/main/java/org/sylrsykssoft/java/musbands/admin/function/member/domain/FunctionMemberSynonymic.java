package org.sylrsykssoft.java.musbands.admin.function.member.domain;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.REPOSITORY_TABLE_NAME;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.envers.AuditOverride;
import org.hibernate.envers.AuditOverrides;
import org.hibernate.envers.Audited;
import org.sylrsykssoft.coreapi.framework.api.model.Base;
import org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
import org.sylrsykssoft.coreapi.framework.api.model.BaseAdminSimple;
import org.sylrsykssoft.coreapi.framework.audit.domain.BaseAdminAudit;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Entity function member synonymic
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@Audited
@AuditOverrides(value = { @AuditOverride(forClass = BaseAdminAudit.class, isAudited = true),
		@AuditOverride(forClass = BaseAdmin.class, isAudited = true),
		@AuditOverride(forClass = BaseAdminSimple.class, isAudited = true),
		@AuditOverride(forClass = Base.class, isAudited = true) })
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
public class FunctionMemberSynonymic extends BaseAdminAudit {

	// Builder
	/**
	 * MusicalGenreBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class FunctionMemberSynonymicBuilder
			extends BaseAdminAuditBuilder<FunctionMemberSynonymic, FunctionMemberSynonymicBuilder> {
		/**
		 * {inheritDoc}
		 */
		@Override
		protected FunctionMemberSynonymicBuilder self() {
			return this;
		}

	}

	// Properties

	@ManyToMany
	@JoinTable(name = "function_member_synonymic_functionmembers", joinColumns = @JoinColumn(name = "function_member_synonymic_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "function_member_id", referencedColumnName = "id"))
	@Singular
	Set<FunctionMember> functionMembers;

}
