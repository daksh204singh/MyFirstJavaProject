package com.rakuten.training.lamdas;

public class StreamOfObjectsVsIntStream {

	public static void main(String[] args) {
		Integer[] intObjects = {1,2,3,4};
		int[] ints = {1,2,3,4};
		
		intObjects[0]++; // int temp = intObjects[0].intValue(); temp++; intObjects[0] = new Integer(temp);
		
		ints[0]++;
		
		System.out.println(intObjects[0]+" ------------- "+ints[0]);
		
		String s;
		
	}

}
