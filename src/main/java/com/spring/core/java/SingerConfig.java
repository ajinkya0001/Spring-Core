package com.spring.core.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SingerConfig {
	
	
	// By deafault name/id of a bean is method name if we dont specify it explicitly
	// instead of specifying like below we can directly use the name of method there in getBean("singer") like this \
	
//	@Bean(name="sg")
	@Bean
	public Singer singer() {
		return new Singer();
	}
}
