package org.sylrsykssoft.java.musbands.admin.musical.genre.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_GET_FIND_ALL_BY_EXAMPLE;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_GET_FIND_BY_EXAMPLE;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_GET_FIND_BY_ID;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_GET_FIND_BY_NAME_MAPPING;
import static org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreConstants.CONTROLLER_REQUEST_MAPPING_TEST;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.sylrsykssoft.coreapi.framework.library.util.JsonStringUtil;
import org.sylrsykssoft.java.musbands.admin.musical.genre.MusicalGenreApplicationTests;
import org.sylrsykssoft.java.musbands.admin.musical.genre.configuration.MusicalGenreTestsConfiguration;
import org.sylrsykssoft.java.musbands.admin.musical.genre.resource.MusicalGenreResource;

/**
 * Musical genre controller test
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@SpringBootTest(classes = { MusicalGenreApplicationTests.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { MusicalGenreTestsConfiguration.class, }, loader = AnnotationConfigContextLoader.class)
public class MusicalGenreControllerControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private MusicalGenreControllerTest musicalGenreController;

	private MusicalGenreResource domain;

	private MusicalGenreResource domainForUdpate;

	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(musicalGenreController).build();

		final String name = "Punk rock 2";
		final String description = "Punk rock (or \"punk\") is a rock music genre that emerged in the mid-1970s in the United States, United Kingdom, and Australia. Rooted in 1960s garage rock and other forms of what is now known as \"proto-punk\" music, punk rock bands rejected perceived excesses of mainstream 1970s rock. They typically produced short, fast-paced songs with hard-edged melodies and singing styles, stripped-down instrumentation, and often political, anti-establishment lyrics. Punk embraces a DIY ethic; many bands self-produce recordings and distribute them through independent record labels. ";

		domain = MusicalGenreResource.musicalGenreResourceBuilder().name(name).description(description).build();

		domainForUdpate = MusicalGenreResource.musicalGenreResourceBuilder().entityId(3).name(name).description(description + " erop").build();
	}

	@Test
	public void testCreateMusicalGenre() throws Exception {
		// call POST /admin/musicalGenres/ application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(JsonStringUtil.asJsonString(domain));

		this.mockMvc.perform(postBuilder).andExpect(status().isCreated());

		// call GET /admin/musicalGenres/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Punk rock");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testDeleteMusicalGenre() throws Exception {
		// call DELETE /admin/musicalGenres/ application/json
		final MockHttpServletRequestBuilder deleteBuilder = MockMvcRequestBuilders.delete(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 3);

		this.mockMvc.perform(deleteBuilder).andExpect(status().isOk());

		// call GET /admin/musicalGenres/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Punk rock");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isNotFound()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAll() throws Exception {

		//		when(musicalGenreService.findAll()).thenReturn(Arrays.asList(new MusicalGenreResource()));

		// call GET /admin/musicalGenres application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST)
				.accept(MediaType.APPLICATION_JSON_VALUE);

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAllByExample() throws Exception {

		// call GET /admin/musicalGenres/name/{name} application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_ALL_BY_EXAMPLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(JsonStringUtil.asJsonString(domain));

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAllByExampleSortable() throws Exception {
		// call GET /admin/musicalGenres/findAll/example/sort application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(JsonStringUtil.asJsonString(domain))
				.param("direction", "asc").param("properties", "name", "description");

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindByExample() throws Exception {

		// call GET /admin/musicalGenres/name/{name} application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_EXAMPLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(JsonStringUtil.asJsonString(domain));

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindById() throws Exception {
		// call GET /admin/musicalGenres/{id} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 1);

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindByName() throws Exception {
		// call GET /admin/musicalGenres/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Pop punk");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testUpdateMusicalGenre() throws Exception {
		// call PUT /admin/musicalGenres/ application/json
		final MockHttpServletRequestBuilder putBuilder = MockMvcRequestBuilders.put(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 3)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(JsonStringUtil.asJsonString(domainForUdpate));

		this.mockMvc.perform(putBuilder).andExpect(status().isOk());

		// call GET /admin/musicalGenres/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Punk rock");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}
}
