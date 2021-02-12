package com.rakuten.training.basics;

// public protected default private
interface A{
	public void f1();// {}
}

interface B{
	public void f1();// {}
}

public class MultiInheritance implements A,B {

	@Override
	public void f1() {
		
		
	}
	
	public MultiInheritance() {
		super();
		
	}
}
