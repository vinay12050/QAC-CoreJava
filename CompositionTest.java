package com.qac.coreJava.association.composition;

public class CompositionTest {

	public static void main(String[] args) {
		
		Engine engine=new Engine(1198,4,"V-Type",57.7f,777);
		
		engine.starting();
		engine.stop();
		
		Car car=new Car("BMW","White",4,777777,1700f,true,engine);
		
		car.starting();
		car.driving();
		car.engineDetails();

	}

}
