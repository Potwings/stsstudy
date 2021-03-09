package org.potwings.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TodoMapperTests {

	@Autowired
	TodoMapper todoMapper;
	
	@Test
	public void testInsert() {
		log.info(todoMapper);
		
		IntStream.rangeClosed(1, 100)
		.forEach(i -> {
			Todo todo = Todo.builder().title("t"+i).build();
			
			todoMapper.insert(todo);
		});
		
		
	}
	
	@Test
	public void testInsert2() {
		
		Todo todo = Todo.builder().title("sample").complete(true).build();
		
		todoMapper.insert2(todo);
		
	}

}
