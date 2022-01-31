package com.qac.coreJava.exceptions.customException;

public class Netflix {
	
	public void streamingVideo(boolean subscription) {
		if(subscription) {
			System.out.println("Streaming the video.");
		}
		else {
			throw new SubscriptionNotValidException("Subscription not valid");
		}
	}

}
