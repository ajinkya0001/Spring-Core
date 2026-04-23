package com.spring.core.component;

import org.springframework.stereotype.Component;

//@Component(value="rd")
@Component
public class Rider {
	
	
	void ride() {
		System.out.println("Riding Yezdi Roadster");
	}
}


// if u are using @Bean that time if u want to give name explicitly then we can use the
// @Bean(name='rd') name

// if u are using the @Component then we can use @Component(value="rd");