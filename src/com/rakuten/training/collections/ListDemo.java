package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	
	
	public static void myAlgo(List<String> l) {
		//some complex algo
		l.add("abc");
		l.add("first");
		l.get(1);
		
//		int size = l.size();
//		for(int i=0;i<size;i++) {
//			String s = l.get(i);
//			System.out.println(s);
//			if(s.length() == 3) {
//				l.remove(s);
//			}
//		}
		
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			if(s.length() == 3) {
				it.remove();
			}
		}
//		System.out.println(l);
		
		for(String s:l) {
			System.out.println(s);
		}
	}
	

	public static void main(String[] args) {
//		demoRawTypeList();

//		demoSpecificList();
		
//		demoAutoBoxing();
		
		List<String> l = new ArrayList<>();
		myAlgo(l);
	}

	private static void demoAutoBoxing() {
		List<Integer> iList = new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		iList.remove(2);
		System.out.println(iList);
		
	}

	private static void demoSpecificList() {
		List<String> sList = new ArrayList<>();
		
		sList.add("abc");
		//sList.add(123);
		String s = sList.get(0);
		
	}

	private static void demoRawTypeList() {
		List l = new ArrayList();
		
		l.add("hello");
		l.add(1); // ==> l.add(new Integer(1));
		l.add(42.0); // ==> l.add(new Double(42.0));
		
		
//		String str =  ""+l.get(1); // ""+l.get(1).toString()
		
		System.out.println(l.size());
		System.out.println(l.get(2));
	}

}
