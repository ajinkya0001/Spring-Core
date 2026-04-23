package com.spring.core.di.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	Engine engine;
	
	
	void moveCar() {
		engine.startEngine();
		System.out.println("Car Starts Movingggg...");
	}
}
