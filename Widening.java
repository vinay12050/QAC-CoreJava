package com.qac.coreJava.typeCasting.widening;

public class Widening {

	public static void main(String[] args) {
		
		byte a=9;
		System.out.println("Byte data a="+a);
		
		short b=a;
		System.out.println("Short data b="+b);
		
		char c='X';
		System.out.println("Char data c="+c);
		
		int d=c;
		System.out.println("Int data d="+d);
		
		char e='@';
		System.out.println("Char data e="+e);
		
		int f=e;
		System.out.println("Int data f="+f);
		
		int g=199;
		System.out.println("int data g="+g);
		
		long h=g;
		System.out.println("long data h="+h);
		
		long i=777777777;
		System.out.println("long data i="+i);
		
		float j=i;
		System.out.println("float data j="+j);
		
		float k=7.77f;
		System.out.println("float data k="+k);
		
		double l=k;
		System.out.println("double data l="+l);
		

	}

}
