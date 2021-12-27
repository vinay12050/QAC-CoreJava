package com.qac.coreJava.abstraction.InterfaceImp;

public class LightImpl implements ISwit{

	@Override
	public void on() {
		System.out.println("Light is on with:"+voltage);
	}

	@Override
	public void off() {
		System.out.println("Light is off.");
	}
	
	

}
