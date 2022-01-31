package com.qac.coreJava.wrapperClasses.autoboxing;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int a=77;
		Integer b=Integer.valueOf(a);
		System.out.println("Value of b="+b);
        
		byte c=1;
		Byte d=Byte.valueOf(c);
		System.out.println("Value of byte object d="+d);
		
		short e=177;
		Short f=Short.valueOf(e);
		System.out.println("Value of short object f="+f);
		
		long g=73456734;
		Long h=Long.valueOf(g);
		System.out.println("Value of long object h="+h);
		
		char i='X';
		Character j=Character.valueOf(i);
		System.out.println("Value of character object j="+j);
	    
		float k=334.345f;
		Float floatObj=k;
		System.out.println("Value of float object floatObj="+floatObj);
		
		double l=86.87344;
		Double m=Double.valueOf(l);
		System.out.println("Value of double object m="+m);
		
		boolean n=false;
		Boolean o=Boolean.valueOf(n);
		System.out.println("Value of boolean object o="+o);
	}

}
