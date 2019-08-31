package org.sylrsykssoft.java.musbands.admin.function.member.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.sylrsykssoft.java.musbands.admin.function.member.FunctionMemberApplicationTests;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberTestsConfiguration;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberSynonymicResource;

/**
 * Function member service test.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@SpringBootTest(classes = { FunctionMemberApplicationTests.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { FunctionMemberTestsConfiguration.class, }, loader = AnnotationConfigContextLoader.class)
public class FunctionMemberServiceTest {

	@Autowired
	private FunctionMemberService functionMemberService;

	private FunctionMemberResource domain;

	private Example<FunctionMemberResource> example;

	@BeforeEach
	public void setUp() {
		final String name = "Lead vocalist";
		final String description = "The lead vocalist in popular music is typically the member of a group or band whose voice is the most prominent in a performance where multiple voices may be heard. The lead singer either leads the vocal ensemble, or sets against the ensemble as the dominant sound. In vocal group performances, notably in soul and gospel music, and early rock and roll, the lead singer takes the main vocal part, with a chorus provided by other band members as backing vocalists.\r\n"
				+ "Especially in rock music, the lead singer or solo singer is often the front man or front woman, who may also play one or more instruments and is often seen as the leader or spokesman of the band by the public. As an example in rock music, Freddie Mercury was the lead singer of Queen. Similarly in soul music, Smokey Robinson was the lead singer of The Miracles. ";

		final FunctionMemberSynonymicResource synonymic1 = FunctionMemberSynonymicResource
				.functionMemberSynonymicResourceBuilder().name("Main vocalist").build();
		final FunctionMemberSynonymicResource synonymic2 = FunctionMemberSynonymicResource
				.functionMemberSynonymicResourceBuilder().name("Lead vocals").build();
		final FunctionMemberSynonymicResource synonymic3 = FunctionMemberSynonymicResource
				.functionMemberSynonymicResourceBuilder().name("Lead singer").build();

		final Set<FunctionMemberSynonymicResource> synonyms = new HashSet<>();
		synonyms.add(synonymic1);
		synonyms.add(synonymic2);
		synonyms.add(synonymic3);

		domain = FunctionMemberResource.functionMemberResourceBuilder().name(name).description(description).synonyms(synonyms).build();

		example = Example.of(domain, ExampleMatcher.matchingAll());
	}

	@Test
	public void testCreateFunctionMember() {
		final String name = "Lead vocalist";
		final FunctionMemberResource FunctionMemberSaved = functionMemberService.create(domain);

		assertThat("Entity did not get an generated Id!", FunctionMemberSaved.getEntityId(), greaterThan(-1));
		assertThat("Entity name did not match!", FunctionMemberSaved.getName(), is(name));

	}

	@Test
	public void testDeleteFunctionMember() {
		final String name = "Lead vocalist";
		final Optional<FunctionMemberResource> optResource = functionMemberService.findByName(name);

		final FunctionMemberResource source = optResource.orElseThrow(IllegalStateException::new);

		assertThat("Entity name did not match!", source.getName(), is(name));

		functionMemberService.delete(source);
	}

	@Test
	public void testFindAllFunctionMembers() {
		final Iterable<FunctionMemberResource> FunctionMembers = functionMemberService.findAll();
		assertNotNull(FunctionMembers);
	}

	// @see https://www.logicbig.com/tutorials/spring-framework/spring-data/query-example-matchers.html
	@Test
	public void testFindOneByExampleFunctionMember() {
		final Optional<FunctionMemberResource> optResource = functionMemberService.findByExample(example);
		assertNotNull(optResource.get());
	}

	@Test
	public void testUpdateFunctionMember() {
		final String name = "Lead vocalist";
		final Optional<FunctionMemberResource> optResource = functionMemberService.findByName(name);

		final FunctionMemberResource resourceGet = optResource.orElseThrow(IllegalStateException::new);

		assertThat("Entity name did not match!", resourceGet.getName(), is(name));

		final FunctionMemberResource resourceUpdated = functionMemberService.update(FunctionMemberResource.functionMemberResourceBuilder().entityId(resourceGet.getEntityId()).name(resourceGet.getName())
				.description(resourceGet.getDescription() + " El ir.").build());

		assertThat("Entity id did not match!", resourceUpdated.getEntityId(), is(resourceGet.getEntityId()));
	}

}
