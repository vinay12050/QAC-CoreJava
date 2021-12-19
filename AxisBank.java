package com.qac.coreJava.finalKeyword.finalMethod;

public class AxisBank extends RBIBank {
	
	float rateOfInterest;
	
	public void printNotes() {
		System.out.println("Axis Bank has no authorisation to print notes");
	}
	
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.printNotes();
	}

}
