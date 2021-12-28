package com.qac.coreJava.inheritance.multi.usingInterface;

public interface IBike {
	
	default void riding() {
		System.out.println("Riding a bike...");
	}

}
