package com.qac.coreJava.array;

public class Numbers {

	public static void main(String[] args) {
		int evenNumbers[]=new int[5];
		evenNumbers[0]=2;
		evenNumbers[1]=4;
		evenNumbers[2]=6;
		evenNumbers[3]=8;
		evenNumbers[4]=10;
		
		System.out.println("Array value at the index 1"+evenNumbers[1]);
		System.out.println("Array value at the Index 3"+evenNumbers[3]);
		System.out.println("Size of the Array:"+evenNumbers.length);
        
		for(int i=0;i<evenNumbers.length;i++) {
			System.out.println("Array value at the index "+i+"="+evenNumbers[i]);
		}
		String comp[]= {"BMW","MAN","TATA","JSW","M&M"};
		arrayPrinter(comp);
		
		String colours[]= {"White","Red","Blue","Green","Black"};
		arrayPrinter(colours);
	}
	public static void arrayPrinter(String array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Array value of the index "+i+"="+array[i]);
		}
	}

}
