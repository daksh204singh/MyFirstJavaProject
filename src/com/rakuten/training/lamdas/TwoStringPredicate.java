package com.rakuten.training.lamdas;

@FunctionalInterface
public interface TwoStringPredicate {
	
	public boolean isFirstBetterThanSecond(String first,String second);
	
	
	
	
	
	
	public default void ting() {
		System.out.println("ting");
	}
}
