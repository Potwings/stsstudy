package org.potwings.board.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ygk.board.service")
@MapperScan(basePackages = "org.ygk.board.mapper")
public class BoardConfig {

}
