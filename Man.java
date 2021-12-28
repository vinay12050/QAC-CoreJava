package com.qac.coreJava.inheritance.multi.usingInterface;

public class Man implements ICar,ITruck {

	@Override
	public void driving() {
		ICar.super.driving();
		ITruck.super.driving();
	}
	
}
