package com.cognixia.jump.restaurant.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.cognixia.jump.restaurant.model.Restaurant;
import com.cognixia.jump.restaurant.repository.RestaurantRepository;
import com.cognixia.jump.restaurant.service.RestaurantService;

@SpringBootTest
@AutoConfigureMockMvc
public class RestaurantControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void apiCall() throws Exception{
		this.mockMvc.perform(get("/restaurants")).andDo(print()).andExpect(status().isOk());
	}
	
	@Test
	public void apiAdd() throws Exception{
		this.mockMvc.perform(post("/add/restaurant")).andDo(print()).andExpect(status().isOk());
	}
	
}
