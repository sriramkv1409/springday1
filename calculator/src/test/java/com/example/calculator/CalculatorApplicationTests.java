package com.example.calculator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(CalculatorController.class)
public class CalculatorApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void testAddition() throws Exception {
		InputDto input = new InputDto();
		input.setA(10);
		input.setB(5);

		mockMvc.perform(post("/api/calculator/add")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(input)))
				.andExpect(status().isOk())
				.andExpect(content().string("15.0"));
	}

}
