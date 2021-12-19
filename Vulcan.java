package com.qac.coreJava.finalKeyword.finalParameter;

public class Vulcan {
	
	public void square(final int x) {
		int result=x*x;
		System.out.println("The square root of x is="+result);
	}
	
	public static void main(String[] args) {
		
		Vulcan v=new Vulcan();
		v.square(20);
	}

}
