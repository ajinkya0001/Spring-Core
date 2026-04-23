package com.spring.core.ambiguity;

import org.springframework.stereotype.Component;

@Component("python")
public class PFS implements Course{

	@Override
	public void courseDetail() {
		
		System.out.println("Python Full Stack!!");
		
	}

}
