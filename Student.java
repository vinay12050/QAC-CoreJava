package com.qac.coreJava.inheritance.multi.usingInterface;

public class Student implements ISQL,IJava {

	@Override
	public void coreJava() {
		System.out.println("Student is learning core java..");
	}

	@Override
	public void learn() {
        System.out.println("Student is learning both Sql and core java.....");		
	}

	@Override
	public void mySql() {
		
        System.out.println("Student is learning My Sql..");		
	}

}
