package com.qac.coreJava.wrapperClasses.unboxing;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer integerObj=new Integer(77);
		Byte byteObj=new Byte((byte)25);
		Character characterObj=new Character('Z');
		Short shortObj=new Short((short)99);
		Long longObj=new Long(35345);
		Float floatObj=new Float(34.4564f);
		Double doubleObj=new Double(345.73524);
		Boolean booleanObj=new Boolean(true);
		
		int i=integerObj.intValue();
		byte b=byteObj;
		char c=characterObj;
		short s=shortObj;
		long l=longObj;
		float f=floatObj;
		double d=doubleObj;
		boolean bo=booleanObj;
		
		System.out.println("Value of int i="+i);
		System.out.println("Value of byte b="+b);
		System.out.println("Value of char c="+c);
		System.out.println("Value of short s="+s);
		System.out.println("Value of long l="+l);
		System.out.println("Value of float f="+f);
		System.out.println("Value of double d="+d);
		System.out.println("Value of boolean bo="+bo);

	}

}
