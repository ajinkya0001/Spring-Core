package com.spring.core.di.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.spring.core.di.component")  // if ur classes in diff package
@ComponentScan                    // if classes in same package its not mandatory to give the basePackages="path";
public class CarConfig {
	
	/* Now Both Car and engine will get scanned here 
	 * so we can make use of this class inside main 
	 * */
	
}
