package com.rakuten.training.basics;

public class NestedLoop {

	public static void main(String[] args) {
		l1:for(int i=0;i<10;i++) {
			System.out.println(i);
			for(int j=10;j<20;j++) {
				if(j == 15) {
					break l1;
				}
			}
			System.out.println("outer loop");
		}
		System.out.println("After outer loop");
	}

}
