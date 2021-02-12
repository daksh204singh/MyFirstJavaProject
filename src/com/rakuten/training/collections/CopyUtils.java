package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.List;

public class CopyUtils {

	public static <T> void copyFromFirstToSecond(List<T> from, List<? super T> to) {

	}

	

	public static void main(String[] args) {
		List<Object> oList = new ArrayList<Object>();
		List<Integer> iList = new ArrayList<>();
		List<Number> nList = new ArrayList<>();
		copyFromFirstToSecond(iList, nList);
	}

}
