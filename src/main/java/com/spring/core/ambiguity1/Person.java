package com.spring.core.ambiguity1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
//	@Autowired
//	@Qualifier("muttonBiryani")
//	Biryani biryani;
	
	void eatingBiryani() {
		System.out.println("Eating ");
		biryani.typeOfBiryani();
		System.out.println("---------");
	}
	
	@Autowired
	Biryani biryani;

	public Biryani getBiryani() {
		return biryani;
	}

	public void setBiryani(Biryani biryani) {
		this.biryani = biryani;
	}
	
	
}
