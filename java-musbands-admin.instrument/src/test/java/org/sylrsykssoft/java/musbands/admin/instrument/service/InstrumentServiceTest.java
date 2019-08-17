package org.sylrsykssoft.java.musbands.admin.instrument.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

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
import org.sylrsykssoft.java.musbands.admin.instrument.InstrumentApplicationTests;
import org.sylrsykssoft.java.musbands.admin.instrument.configuration.InstrumentTestsConfiguration;
import org.sylrsykssoft.java.musbands.admin.instrument.resource.InstrumentResource;

/**
 * Instrument service test.
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@SpringBootTest(classes = { InstrumentApplicationTests.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { InstrumentTestsConfiguration.class, }, loader = AnnotationConfigContextLoader.class)
public class InstrumentServiceTest {

	@Autowired
	InstrumentService instrumentService;

	InstrumentResource domain;

	Example<InstrumentResource> example;

	@BeforeEach
	public void setUp() {
		final String name = "Vocal";
		final String description = "Vocal music is a type of music performed by one or more singers, either with instrumental accompaniment, or without instrumental accompaniment (a cappella), in which singing provides the main focus of the piece. Music which employs singing but does not feature it prominently is generally considered instrumental music (e.g. the wordless women's choir in the final movement of Holst's The Planets) as is music without singing. Music without any non-vocal instrumental accompaniment is referred to as a cappella."
				+ "Vocal music typically features sung words called lyrics, although there are notable examples of vocal music that are performed using non-linguistic syllables, sounds, or noises, sometimes as musical onomatopoeia. A short piece of vocal music with lyrics is broadly termed a song."
				+ "Vocal music is probably the oldest form of music, since it does not require any instrument besides the human voice. All musical cultures have some form of vocal music.";

		domain = InstrumentResource.instrumentResourceBuilder().name(name).description(description).build();

		example = Example.of(domain, ExampleMatcher.matchingAll());
	}

	@Test
	public void testCreateMusicalGenre() {
		final String name = "Vocal";
		final InstrumentResource musicalGenreSaved = instrumentService.create(domain);

		assertThat("Entity did not get an generated Id!", musicalGenreSaved.getEntityId(), greaterThan(-1));
		assertThat("Entity name did not match!", musicalGenreSaved.getName(), is(name));

	}

	@Test
	public void testDeleteMusicalGenre() {
		final String name = "Vocal";
		final Optional<InstrumentResource> optResource = instrumentService.findByName(name);

		final InstrumentResource source = optResource.orElseThrow(IllegalStateException::new);

		assertThat("Entity name did not match!", source.getName(), is(name));

		instrumentService.delete(source);
	}

	@Test
	public void testFindAllMusicalGenres() {
		final Iterable<InstrumentResource> musicalGenres = instrumentService.findAll();
		assertNotNull(musicalGenres);
	}

	// @see https://www.logicbig.com/tutorials/spring-framework/spring-data/query-example-matchers.html
	@Test
	public void testFindOneByExampleMusicalGenre() {
		final Optional<InstrumentResource> optResource = instrumentService.findByExample(example);
		assertNotNull(optResource.get());
	}

	@Test
	public void testUpdateMusicalGenre() {
		final String name = "Vocal";
		final Optional<InstrumentResource> optResource = instrumentService.findByName(name);

		final InstrumentResource resourceGet = optResource.orElseThrow(IllegalStateException::new);

		assertThat("Entity name did not match!", resourceGet.getName(), is(name));

		final InstrumentResource resourceUpdated = instrumentService
				.update(InstrumentResource.instrumentResourceBuilder().entityId(resourceGet.getEntityId())
						.name(resourceGet.getName())
						.description(resourceGet.getDescription() + " El ir.").build());

		assertThat("Entity id did not match!", resourceUpdated.getEntityId(), is(resourceGet.getEntityId()));
	}

}
