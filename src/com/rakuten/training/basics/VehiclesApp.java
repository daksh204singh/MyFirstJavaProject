package com.rakuten.training.basics;

public class VehiclesApp {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
		
		Vehicle v = new Bus();
		
		Driver d = new Driver();
		
		d.testDrive(v);

	}

}
