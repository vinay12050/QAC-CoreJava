package com.qac.coreJava.association.aggregation;

public class Mobile {
	
	String brand;
	String colour;
	double price;
	float battery;
	String processor;
	
	HeadPhone hp;
	
    public void calling() {
    	System.out.println("Calling xyz....");
    	System.out.println("Mobile brand:"+this.brand);
    	System.out.println("Moble colour:"+this.colour);
    	System.out.println("Price of mobile:"+this.price);
    	System.out.println("Battery capacity of moblie:"+this.battery);
    	System.out.println("Mobile procesor:"+this.processor);
    }
    
    public void browsing() {
    	System.out.println("Browsing photos...");
    	hp.connection();
    	hp.listeningMusic();
    }
    
    public void headPhoneDetails() {
    	System.out.println(".....Head Phone Details...");
    	System.out.println("Brand:"+hp.brand);
    	System.out.println("Colour of headphone:"+hp.colour);
    	System.out.println("Price of headphones:"+hp.price);
    	System.out.println("Headphone is wired:"+hp.isWired);
    }
}
