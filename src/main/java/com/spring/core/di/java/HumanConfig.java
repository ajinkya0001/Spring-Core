package com.spring.core.di.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HumanConfig {
	
	@Bean
	public Heart heart() {
		return new Heart();
	}
	
	@Bean
//	public Human human() {   // field based DI
//		return new Human();
//	}
	
//	public Human human() {          // for Constructor DI
//		return new Human(new Heart());
//	}
	
	public Human human() {
		return new Human();
	}

}
