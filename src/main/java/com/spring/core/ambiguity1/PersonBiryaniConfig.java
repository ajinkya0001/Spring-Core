package com.spring.core.ambiguity1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan // no package name provided 
public class PersonBiryaniConfig {
	
	@Bean
	public Person person() {
		return new Person();
	}
	@Bean(name="chick")
	@Primary
	public ChichkenBiryani chickeBiryani() {
		return new ChichkenBiryani();
	}
	
	@Bean(name="mutt") 
//	@Primary
	@Qualifier("ChichkenBiryani")
	public MuttonBiryani muttonBiryani() {
		return new MuttonBiryani();
	}
}
