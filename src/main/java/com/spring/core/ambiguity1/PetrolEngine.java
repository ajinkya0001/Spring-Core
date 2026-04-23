package com.spring.core.ambiguity1;

import org.springframework.stereotype.Component;

//@Component

public class PetrolEngine implements Engine{

	
	public void engineType() {
		
		System.out.println("2.8l Petrol Engine");
		System.out.println("Color : Petrol");
	}
	
}
