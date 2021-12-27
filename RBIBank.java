package com.qac.coreJava.abstraction.abstractKey;

public abstract class RBIBank {
	
	int interest=9;
	
	public RBIBank() {
		System.out.println("RBI Bank Called..");
	}
	
	public abstract void fixedInterest();

}
