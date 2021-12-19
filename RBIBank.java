package com.qac.coreJava.finalKeyword.finalMethod;

public class RBIBank {
	
	String branch;
	String ifscCode;
	
	public final void printNotes() {
		System.out.println("RBI is printing Notes");
	}
	
	public void head() {
		System.out.println("RBI is head of all the Banks");
	}
	
	public final void location() {
		System.out.println("The Bank is located in India....");
	}

}
