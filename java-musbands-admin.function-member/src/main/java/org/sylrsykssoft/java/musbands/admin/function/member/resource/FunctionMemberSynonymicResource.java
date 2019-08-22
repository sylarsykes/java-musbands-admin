package org.sylrsykssoft.java.musbands.admin.function.member.resource;

import java.beans.ConstructorProperties;
import java.time.LocalDateTime;
import java.util.Set;

import org.sylrsykssoft.coreapi.framework.api.resource.BaseAdminResource;
import org.sylrsykssoft.java.musbands.admin.function.member.domain.FunctionMember;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

/**
 * DTO FunctionMemberSynonymic
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter
@Getter
@EqualsAndHashCode(callSuper = false, doNotUseGetters = true, exclude = "functionMembers")
public class FunctionMemberSynonymicResource extends BaseAdminResource {

	// Properties

	private @Singular Set<FunctionMember> functionMembers;

	// Builder
	/**
	 * AllArgsConstructor
	 * 
	 * @param entityId
	 * @param name
	 * @param functionMembers
	 * @param createdAt
	 * @param updatedAt
	 * 
	 */
	@Builder(builderMethodName = "functionMemberSynonymicResourceBuilder")
	@ConstructorProperties({ "entityId", "name", "description", "synonyms", "createdAt", "updatedAt", "removedAt" })
	public FunctionMemberSynonymicResource(final Integer entityId, final String name, final String description,
			final Set<FunctionMember> functionMembers,
			final LocalDateTime createdAt, final LocalDateTime updatedAt, final LocalDateTime removedAt) {
		super(entityId, name, description, createdAt, updatedAt, removedAt);
		this.functionMembers = functionMembers;
	}
}
