package com.rakuten.training.basics;

public class Driver {
	
	public void testDrive(Vehicle v) {
		
//		Car c = (Car) v;
		
		v.start();
		System.out.println("<<<<<<<< Taking it out for a spin!! >>>>>>>>");
		v.stop();
	}

}
