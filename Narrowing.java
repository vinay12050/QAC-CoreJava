package com.qac.coreJava.typeCasting.widening;

public class Narrowing {

	public static void main(String[] args) {
		
		double a=345.87687;
		System.out.println("double data a="+a);
		
		float b=(float)a;
		System.out.println("float data b="+b);
		
		float c=876.6754657f;
		System.out.println("float data c="+c);
		
		long d=(long)c;
		System.out.println("long data d="+d);
		
		long e=765658776;
		System.out.println("long data e="+e);
		
		int f=(int)e;
		System.out.println("int data f="+f);
		
		int g=77;
		System.out.println("int data g="+g);
		
		char h=(char)g;
		System.out.println("char data h="+h);
		
		char m='%';
		System.out.println("char data m="+m);
		
		short n=(short)m;
		System.out.println("short data n="+n);
		

	}

}
