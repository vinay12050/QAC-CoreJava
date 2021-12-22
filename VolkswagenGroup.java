package com.qac.coreJava.superKeyword.superVariable;

public class VolkswagenGroup {
	
	String brand;
	String colour="Green";
	int noOfCompanies;
	String origin;
	
	public VolkswagenGroup() {
		System.out.println("Created an object with no parameters..");
	}
	
	public VolkswagenGroup(String brand,String origin,int noOfCompanies) {
		System.out.println("Created an object with 3 parameters");
		this.brand=brand;
		this.origin=origin;
		this.noOfCompanies=noOfCompanies;
		System.out.println("Brand="+brand);
		System.out.println("Origin of group="+origin);
		System.out.println("Number of companies in the group="+noOfCompanies);
	}
	
	public void manufacture() {
		System.out.println("Volkswagen group is into manufacturing sector..");
	}
	
	public void sell() {
		System.out.println("Volkswagen group sell both passenger and commercial vehicles..");
	}
	

}
