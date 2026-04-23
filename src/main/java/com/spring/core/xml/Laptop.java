package com.spring.core.xml;

public class Laptop {
	
//	public void lapType() {
//		System.out.println("Gaming Laptop!!");
//	}
	
	String lcode;
	String company;
	int ram;
	int rom;
	
//	public Laptop(String lcode, String company, int ram, int rom) {
//		
//		this.lcode = lcode;
//		this.company = company;
//		this.ram = ram;
//		this.rom = rom;
//	}
	
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setRom(int rom ) {
		this.rom = rom;
	}
	
	public String getLcode() {
		return lcode;
	}
	public String getCompany() {
		return company;
	}
	public int getRam() {
		return ram;
	}
	public int getRom() {
		return rom;
	}
	
	@Override
	public String toString() {
		return "LAPTOP : [lcode : " + lcode + ", company : " + company + ", ram : " + ram + ", rom : " + rom + "]";
	}
	
	

}
