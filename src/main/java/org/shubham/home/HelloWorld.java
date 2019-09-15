package org.shubham.home;

import java.util.Collections;

import org.shubham.home.item3.Elvis;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * String sample = "Some Text!"; for(int i = 1 ; i<=10 ; i++)
		 * System.out.println(sample);
		 */
		
		/*
		 * HelloWorld helloWorld = new HelloWorld();
		 * helloWorld.howFastStringInstanntiation();
		 */
		
		Elvis a = Elvis.INSTANCE;
		
		Elvis b = Elvis.INSTANCE;
		
		System.out.println(a==b);	
	}
	
	private static void howFastStringInstanntiation() {
		long startTime = System.nanoTime();
		String s = "Hello World";
		System.out.println("Direct Iinstantiation took "+(System.nanoTime()-startTime)+"ns");
		
		startTime = System.nanoTime();
		String s2 = new String("World Hello");
		System.out.println("Indirect Iinstantiation took "+(System.nanoTime()-startTime)+"ns");
		
		Boolean.valueOf(false);
	}
}
