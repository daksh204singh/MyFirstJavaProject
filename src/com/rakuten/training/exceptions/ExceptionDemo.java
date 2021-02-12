package com.rakuten.training.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
		int num = 0;
		int result = 100 / num;
		
	}

}
