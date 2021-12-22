package com.qac.coreJava.superKeyword.superVariable;

public class Vehicle {
	String model;
	String colour="Red";
	int gear;
	double price;
	int speed=80;
	
	public Vehicle() {
		System.out.println("Vehicle object is created with no parameters..");
	}
	
	public Vehicle(String colour,double price,int gear) {
		System.out.println("Vehicle object is created with 3 parameters..");
		this.colour=colour;
		this.gear=gear;
		this.price=price;
	}
	
	public void start() {
		System.out.println("Started the vehicle..");
	}
	
	public void stop() {
		System.out.println("Stopped the vehicle..");
	}
	
	public void vehicleDetails() {
		System.out.println("Vehicle colour="+colour);
		System.out.println("Price of Vehicle="+price);
		System.out.println("Vehicle gears="+gear);
	}

}
