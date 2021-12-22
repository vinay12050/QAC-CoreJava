package com.qac.coreJava.superKeyword.superVariable;

public class VehicleTester {
	
	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.maxSpeed();
		b.minSpeed();
		b.checkColour();
		b.start();
		new Bike("White",270,6,77777.77);
		
	}

}
