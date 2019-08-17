package org.sylrsykssoft.java.musbands.admin.function.member.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_ALL_BY_EXAMPLE;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_EXAMPLE;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_ID;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_GET_FIND_BY_NAME_MAPPING;
import static org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberConstants.CONTROLLER_REQUEST_MAPPING_TEST;

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
import org.sylrsykssoft.java.musbands.admin.function.member.FunctionMemberApplicationTests;
import org.sylrsykssoft.java.musbands.admin.function.member.configuration.FunctionMemberTestsConfiguration;
import org.sylrsykssoft.java.musbands.admin.function.member.resource.FunctionMemberResource;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Function member controller test
 * 
 * @author juan.gonzalez.fernandez.jgf
 *
 */
@SpringBootTest(classes = { FunctionMemberApplicationTests.class })
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { FunctionMemberTestsConfiguration.class, }, loader = AnnotationConfigContextLoader.class)
public class FunctionMemberControllerControllerTest {

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}

	private MockMvc mockMvc;

	@Autowired
	FunctionMemberControllerTest functionMemberController;
	FunctionMemberResource domain;

	FunctionMemberResource domainForUdpate;

	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(functionMemberController).build();

		final String name = "Lead guitar";
		final String description = "Lead guitar is a musical part for a guitar in which the guitarist plays melody lines, instrumental fill passages, guitar solos, and occasionally, some riffs within a song structure. The lead is the featured guitar, which usually plays single-note-based lines or double-stops.[1] In rock, heavy metal, blues, jazz, punk, fusion, some pop, and other music styles, lead guitar lines are usually supported by a second guitarist who plays rhythm guitar, which consists of accompaniment chords and riffs.";

		domain = FunctionMemberResource.functionMemberResourceBuilder().name(name).description(description).build();

		domainForUdpate = FunctionMemberResource.functionMemberResourceBuilder().entityId(3).name(name).description(description + " erop").build();
	}

	@Test
	public void testCreateFunctionMember() throws Exception {
		// call POST /admin/functionMembers/ application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(asJsonString(domain));

		this.mockMvc.perform(postBuilder).andExpect(status().isCreated());

		// call GET /admin/functionMembers/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Lead guitar");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testDeleteFunctionMember() throws Exception {
		// call DELETE /admin/functionMembers/ application/json
		final MockHttpServletRequestBuilder deleteBuilder = MockMvcRequestBuilders.delete(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 2);

		this.mockMvc.perform(deleteBuilder).andExpect(status().isOk());

		// call GET /admin/functionMembers/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Lead guitar");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isNotFound()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAll() throws Exception {

		//		when(FunctionMemberService.findAll()).thenReturn(Arrays.asList(new FunctionMemberResource()));

		// call GET /admin/functionMembers application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST)
				.accept(MediaType.APPLICATION_JSON_VALUE);

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAllByExample() throws Exception {

		// call GET /admin/functionMembers/name/{name} application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_ALL_BY_EXAMPLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(asJsonString(domain));

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindAllByExampleSortable() throws Exception {
		// call GET /admin/functionMembers/findAll/example/sort application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_ALL_BY_EXAMPLE_SORTABLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(asJsonString(domain)).param("direction", "asc").param("properties", "name", "description");

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindByExample() throws Exception {

		// call GET /admin/functionMembers/name/{name} application/json
		final MockHttpServletRequestBuilder postBuilder = MockMvcRequestBuilders.post(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_EXAMPLE)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(asJsonString(domain));

		final MvcResult result = mockMvc.perform(postBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindById() throws Exception {
		// call GET /admin/functionMembers/{id} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 1);

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testFindByName() throws Exception {
		// call GET /admin/FunctionMembers/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Lead guitar");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}

	@Test
	public void testUpdateFunctionMember() throws Exception {
		// call PUT /admin/functionMembers/ application/json
		final MockHttpServletRequestBuilder putBuilder = MockMvcRequestBuilders.put(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_ID, 2)
				.contentType(MediaType.APPLICATION_JSON_VALUE).content(asJsonString(domainForUdpate));

		this.mockMvc.perform(putBuilder).andExpect(status().isOk());

		// call GET /admin/functionMembers/name/{name} application/json
		final RequestBuilder requestBuilder = MockMvcRequestBuilders.get(CONTROLLER_REQUEST_MAPPING_TEST + CONTROLLER_GET_FIND_BY_NAME_MAPPING, "Lead guitar");

		final MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andDo(print()).andReturn();

		assertNotNull(result.getResponse(), "Empty value");
	}
}
