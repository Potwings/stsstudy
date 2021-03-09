package org.potwings.time.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "org.ygk.time.mapper")
@ComponentScan(basePackages = "org.ygk.time.service")
public class TimeConfig {

}
