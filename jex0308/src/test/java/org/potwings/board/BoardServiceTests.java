package org.potwings.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.board.config.BoardConfig;
import org.potwings.board.service.BoardService;
import org.potwings.common.config.CommonConfig;
import org.potwings.common.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CommonConfig.class, BoardConfig.class })
@Log4j
public class BoardServiceTests {

	@Autowired
	BoardService service;
	
	@Test
	public void listTest() {
		
		PageDTO pageDTO = new PageDTO();
		
		log.info(service.getList(pageDTO));
		
	}
}
