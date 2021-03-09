package org.potwings.common;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

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
	DataSource ds;
	
	@Test
	public void test1() {
		log.info("testing....");
		
		assertNotNull(ds);
	}

	@Test
	public void jdbctest() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/dclass?serverTimezone=UTC";
		String userName = "springuser";
		String password = "springuser";

		Connection con = DriverManager.getConnection(url, userName, password);

		log.info(con);

		con.close();
	}

}
