package com.qac.coreJava.inheritance.multi.usingInterface;

public interface ITruck {
	
	default void driving() {
		System.out.println("Driving the truck..");
	}

}
