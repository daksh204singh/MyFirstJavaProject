package com.rakuten.training.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.rakuten.training.collections.SortDemo;

public class LambdaDemo {
	
	public static int sI = 20;
	
	public static void effectivelyFinalDemo() {
		
		int i = 10;
		
		betterString("hi","Hello",(s1,s2) -> {
			System.out.println(i);
			return s1.length() > s2.length();
		});
		
//		i++;
	}
	
	
	public int eChecker(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList(SortDemo.strings));
		Collections.sort(strings, (s1,s2) -> s1.length() - s2.length());
		System.out.println(strings);
//		Collections.sort(strings,LambdaDemo::eChecker);
		LambdaDemo obj = new LambdaDemo();
		Collections.sort(strings,obj::eChecker);
		System.out.println(strings);
		
		String lengthier = betterElement("hi","Hello",(s1,s2) -> s1.length() > s2.length());
		
		
		System.out.println(lengthier);
		System.out.println("____________");
		effectivelyFinalDemo();
	}

	public static String betterString(String string1, String string2, TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(string1, string2)) {
			return string1;
		}else {
			return string2;
		}
	}
	
	public static <ET> ET betterElement(ET e1,ET e2,TwoElementPredicate<ET> decider) {
		
		if(decider.isFirstBetterThanSecond(e1, e2)) {
			return e1;
		}else {
			return e2;
		}
	}

}
