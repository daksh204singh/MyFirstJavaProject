package com.rakuten.training.lamdas;

@FunctionalInterface
public interface TwoElementPredicate<T> {
	
	public boolean isFirstBetterThanSecond(T first,T second);

}
