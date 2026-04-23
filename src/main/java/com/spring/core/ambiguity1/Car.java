package com.spring.core.ambiguity1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Car {
	
//	@Autowired
//	@Qualifier("petrolEngine")
	
	
	Engine pengine;
	
	
	
	public Engine getPengine() {
		return pengine;
	}



	public void setPengine(Engine pengine) {
		this.pengine = pengine;
	}



	void carName() {
		System.out.println("Toyota Fortuner");
		pengine.engineType();
	}
}

// for constructor based DI then we need to use the <bean id="car" class="com.spring.core.Car" autowire="constructor"> </bean>
