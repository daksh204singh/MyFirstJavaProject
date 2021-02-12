package com.rakuten.training.basics;

public class PrimitiveVsReference {
	
	static int class_level_x;
	
	
	public static void f1(int i) {
		//something
	}
	
	public static void f1(long l) {
		//something else
	}

	public static void main(String[] args) {
		
		int x;
		class_level_x++;
		System.out.println(class_level_x);
		
//		x++;
		
//		System.out.println(x);
		
		
		  int i = 4;
		  
		  f1(100L);
		 
		
	//	long someLong = 100;
		
		someFun1(i);
		System.out.println(i);
//		Integer intObj = new Integer(i);
		Integer intOnj = i;
		
		int[] nums = new int[10];
		nums[0] = 20;
		someFun2(nums);
		System.out.println(nums[0]);

	}
	
	public static void someFun1(int someNum) {
		someNum++;
	}

	public static void someFun2(int someNums[]) {
		someNums[0]++;
	}
}
