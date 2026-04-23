package com.spring.core.ambiguity1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ChichkenBiryani implements Biryani{

	@Override
	public void typeOfBiryani() {
		System.out.println("Chicken Biryani!!");
	}

}
