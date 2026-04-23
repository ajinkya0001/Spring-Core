package com.spring.core.ambiguity1;

import org.springframework.stereotype.Component;

@Component
public class MuttonBiryani implements Biryani{

	@Override
	public void typeOfBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Mutton Biryani!!");
	}
	
}
