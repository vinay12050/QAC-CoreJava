package com.qac.coreJava.exceptions.customException;

public class NetflixTester {

	public static void main(String[] args) {
		
		try {
		Netflix netflix=new Netflix();
		boolean subscription=false;
		netflix.streamingVideo(subscription);
		}
		catch(SubscriptionNotValidException e) {
			System.out.println("Caught the Exception");
			System.out.println(e);
		}

	}

}
