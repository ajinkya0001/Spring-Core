package com.spring.core.ambiguity1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class DieselEngine implements Engine{
	
	public void engineType() {
		System.out.println("2.8l Diesel Engine.");
		System.out.println("Color : Black");
	}
}
