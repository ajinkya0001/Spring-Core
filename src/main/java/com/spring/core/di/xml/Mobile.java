package com.spring.core.di.xml;

public class Mobile {
	Charger charger;
	public Mobile(Charger charger) {
		this.charger = charger;
	}
	
	void playGame() {
		System.out.println("Battery Low..");
		charger.charge();
		System.out.println("Let's Play PUBG..");
	}
	
}
