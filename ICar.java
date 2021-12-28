package com.qac.coreJava.inheritance.multi.usingInterface;

public interface ICar {
	
	default void driving() {
		System.out.println("Driving the car..");
	}

}
