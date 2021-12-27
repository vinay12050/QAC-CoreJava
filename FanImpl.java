package com.qac.coreJava.abstraction.InterfaceImp;

public class FanImpl implements ISwit{

	@Override
	public void on() {
		System.out.println("Fan is on with:"+voltage);
	}

	@Override
	public void off() {
		System.out.println("Fan is of..");
		}
	
	

}
