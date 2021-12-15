package com.qac.coreJava.association.aggregation;

public class AggregationTest {

	public static void main(String[] args) {
		
		System.out.println("Main method Started");
		
		HeadPhone headPhone=new HeadPhone();
		
		headPhone.brand="Boat";
		headPhone.colour="Blue";
		headPhone.price=777;
		headPhone.isWired=true;
		
		Mobile mob=new Mobile();
		
		mob.brand="Samsung";
		mob.colour="Blue";
		mob.price=77777;
		mob.processor="SnapDragon";
		mob.hp=headPhone;
		mob.calling();
		mob.browsing();
		mob.headPhoneDetails();
		
        System.out.println("End of Main Method");
	}

}
