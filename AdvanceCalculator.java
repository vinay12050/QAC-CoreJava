package com.qac.coreJava.finalKeyword.finalVariable;

public class AdvanceCalculator {
	
	final static String name;
	
	static {
		System.out.println(name="Advance");
	}
	
	final float pi=3.142f;
	
	public void dia(int a,int b) {
		float result=a+b/pi;
		System.out.println("Result of dia:"+result);
	}

}
