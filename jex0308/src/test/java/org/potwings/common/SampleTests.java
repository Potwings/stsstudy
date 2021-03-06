package org.potwings.common;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.potwings.common.config.CommonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CommonConfig.class)
@Log4j
public class SampleTests {

	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private DataSource ds;
	
	
	@Test
	public void test1() {
		log.info("tests.......");
		assertNotNull(ds);
	}
	
	@Test
	public void test2() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		log.info(sqlSession);
		
		sqlSession.close();
	}
}
