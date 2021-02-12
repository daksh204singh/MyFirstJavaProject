package com.rakuten.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser user = new StackUser();
		
		FixedArrayStack s = new FixedArrayStack(9);
//		FixedArrayStack s2 = new FixedArrayStack(100);
//		DynamicSizedStack s = new DynamicSizedStack();
		user.fill10(s);

	}

}
