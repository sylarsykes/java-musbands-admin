package org.sylrsykssoft.java.musbands.admin.function.member.domain;

import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.REPOSITORY_ENTITY_NAME;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.REPOSITORY_TABLE_NAME;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
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
import lombok.experimental.FieldDefaults;

/**
 * Entity FunctionMember
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Table(name = REPOSITORY_TABLE_NAME)
@Entity(name = REPOSITORY_ENTITY_NAME)
@DynamicInsert
@DynamicUpdate
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true, exclude = "synonyms")
@ToString(callSuper = true, includeFieldNames = true)
@EntityListeners({ BaseListener.class })
public class FunctionMember extends BaseAdmin {

	// Builder
	/**
	 * MusicalGenreBuilder
	 * 
	 * @author juan.gonzalez.fernandez.jgf
	 *
	 */
	public static class FunctionMemberBuilder extends BaseAdminBuilder<FunctionMember, FunctionMemberBuilder> {
		/**
		 * {inheritDoc}
		 */
		@Override
		protected FunctionMemberBuilder self() {
			return this;
		}

	}

	// Properties
	// Relationships
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "function_member_synonymic_functionmembers", joinColumns = @JoinColumn(name = "function_member_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "function_member_synonymic_id", referencedColumnName = "id"))
	@Singular
	Set<FunctionMemberSynonymic> synonyms;
}
