package com.rakuten.training.basics;

public class FixedArrayStack implements Stack{
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		try {
			contents[++top] = anElement;
		} catch (ArrayIndexOutOfBoundsException e) {
			--top;
			throw new StackFullException("Stack is full, num of elements="+contents.length,e);
		}
		
	}

	@Override
	public Object pop() {
		return contents[top--];
		
	}
}
