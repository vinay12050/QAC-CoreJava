package com.qac.coreJava.association.composition;

public class Engine {
	
	int engineCC;
	int noOfCylinders;
	String engineType;
	float engineWeight;
	int enginePower;
	
	public Engine(int engineCC,int noOfCylinders,String engineType,float engineWeight,int enginePower) {
		this.engineCC=engineCC;
		this.noOfCylinders=noOfCylinders;
		this.engineType=engineType;
		this.engineWeight=engineWeight;
		this.enginePower=enginePower;
	}
	
	public void starting() {
		System.out.println("Engine is Starting.");
	}
	
	public void stop() {
		System.out.println("Engine is stopped");
	}

}
