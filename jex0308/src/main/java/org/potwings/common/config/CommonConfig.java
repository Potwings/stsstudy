package org.potwings.common.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;

@Configuration
@Log4j
public class CommonConfig {
	
	@Bean
	public String sample() {
		
		log.info("sample..............");
		return "sample";
	}
	
	@Bean
	public DataSource dataSource() throws Exception{
		
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/dclass?serverTimezone=UTC");
		hikariConfig.setUsername("springuser");
		hikariConfig.setPassword("springuser");
		
//		DataSource dataSource = hikariConfig.getDataSource();
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		
		return sqlSessionFactoryBean.getObject();
	}

}
