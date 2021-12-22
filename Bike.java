package com.qac.coreJava.superKeyword.superVariable;

public class Bike extends Vehicle{
	int speed=180;
	
	public Bike() {
		System.out.println("Bike constructor is created with no parameters..");
	}
	
	public Bike(String colour,int speed,int gear,double price) {
		super(colour,price,gear);
		System.out.println("Bike object is created with 4 parameters..");
		System.out.println("Colour of bike:"+colour);
		System.out.println("Speed of bike:"+speed);
		System.out.println("Bike Gears:"+gear);
		System.out.println("Price of bike:"+price);
	}
	
	public void maxSpeed() {
		System.out.println("Max Speed of bike="+this.speed);
	}
	
	public void minSpeed() {
		System.out.println("Min Speed of bike"+super.speed);
	}
	
	public void checkColour() {
		System.out.println("colour of bike="+super.colour);
	}

}
