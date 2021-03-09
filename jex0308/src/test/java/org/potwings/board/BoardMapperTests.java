package org.potwings.board;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.board.config.BoardConfig;
import org.potwings.board.domain.Board;
import org.potwings.board.mapper.BoardMapper;
import org.potwings.common.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CommonConfig.class, BoardConfig.class })
@Log4j
public class BoardMapperTests {

	@Autowired
	BoardMapper mapper;

	@Test
	public void test1() {

		List<Board> newlist = mapper.getlist(0,10);

		newlist.forEach(b -> log.info(b));

	}
	
	@Test
	public void testInsert() {
		
		mapper.insert(Board.builder()
				.title("한글제목")
				.content("한글테스트")
				.writer("유저빵빵")
				.build());
		
		
	}
}
