package com.spring.core.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("java")
//@Primary       // by type for the ambiguity 
public class JFS implements Course{

	@Override
	public void courseDetail() {
		
		System.out.println("Java Fullstack 8 months");
		
	}

}


/*  AMBIGUITY
 * 
 * 
 */