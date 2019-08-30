package org.sylrsykssoft.java.musbands.admin.function.member.domain;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberSynonymicConstants.REPOSITORY_TABLE_NAME;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.sylrsykssoft.coreapi.framework.api.model.BaseAdmin;
import org.sylrsykssoft.coreapi.framework.database.model.listener.BaseListener;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.ToString;

/**
 * Entity function member synonymic
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@Data
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, includeFieldNames = true)
@EntityListeners({ BaseListener.class })
public class FunctionMemberSynonymic extends BaseAdmin {

	// Builder
	/**
	 * MusicalGenreBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class FunctionMemberSynonymicBuilder
	extends BaseAdminBuilder<FunctionMemberSynonymic, FunctionMemberSynonymicBuilder> {
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
	private @Singular Set<FunctionMember> functionMembers;

}
