package com.qac.coreJava.abstraction.InterfaceImp;

public class SwitTester {

	public static void main(String[] args) {
		
		ISwit ipl=new LightImpl();
		ipl.on();
		ipl.off();
		
		ISwit ipl2=new FanImpl();
		ipl2.on();
		ipl2.off();

	}

}
