package com.qac.coreJava.association.composition;

public class Car {
	
	String brand;
	String colour;
	int noOfDoors;
	double price;
	float weight;
	boolean isAutomatic;
	final Engine engine;
		
		public Car(String brand,String colour,int noOfDoors,double price,float weight,boolean isAutomatic,Engine engine) {
			this.brand=brand;
			this.colour=colour;
			this.noOfDoors=noOfDoors;
			this.price=price;
			this.weight=weight;
			this.isAutomatic=isAutomatic;
			this.engine=engine;
			System.out.println("Brand of car="+this.brand);
			System.out.println("Colour of Car:"+this.colour);
			System.out.println("Number of Doors:"+this.noOfDoors);
			System.out.println("Price of Car:"+this.price);
			System.out.println("Weight of Car:"+this.weight);
			System.out.println("Transmission of Car is Automatic:"+this.isAutomatic);
			System.out.println(this.engine);
		}
		
		public void starting() {
			System.out.println("Car is starting..");
		}
		
		public void driving() {
			System.out.println("Driving the Car..");
		}
		
		public void engineDetails() {
			System.out.println(".......Engine Details.......");
			System.out.println("Engine spec:"+engine.engineCC);
		    System.out.println("Number of cylinders in Engine="+engine.noOfCylinders);
		    System.out.println("Weight of Engine="+engine.engineWeight);
		    System.out.println("Type of Engine="+engine.engineType);
		    System.out.println("Power of Engine="+engine.enginePower);
		}

}
