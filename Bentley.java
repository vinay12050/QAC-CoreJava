package com.qac.coreJava.superKeyword.superVariable;

public class Bentley extends VolkswagenGroup {

	double price;
	String headQuarters;
	
	public Bentley() {
		super();
		System.out.println("Created Bentley object with no parameters....");
	}
	
	public Bentley(String headQuarters,double price) {
		super(brand,origin,noOfCompanies);
		System.out.println("Created Bentley object with 2 parameters...");
		this.headQuarters=headQuarters;
		this.price=price;
		System.out.println("HeadQuarters of Bentley Motors="+headQuarters);
		System.out.println("Price of a Bentley Car="+price);
	}
	
	public void company() {
		System.out.println("Bentley Motors is a subsidiary of Volkswagen Group..");
	}
	
	public void car() {
		System.out.println("Colour of Car="+super.colour);
	}

}
