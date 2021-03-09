package org.potwings.board;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.board.config.BoardConfig;
import org.potwings.common.config.CommonConfig;
import org.potwings.common.config.ServletConfig;
import org.potwings.common.dto.PageDTO;
import org.potwings.time.config.TimeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class, BoardConfig.class, ServletConfig.class, TimeConfig.class})
@Log4j
@WebAppConfiguration
public class BoardControllerTests {

	@Autowired
	WebApplicationContext ctx;
	
	MockMvc mockMvc;
	
	@Before
	public void setUP() {
		
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
		
	}
	
	@Test
	public void test1() {
		log.info(mockMvc);
	}
	
	@Test
	public void test2() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("page", "3").param("perSheet", "10")).andDo(print());
	}
	
}
