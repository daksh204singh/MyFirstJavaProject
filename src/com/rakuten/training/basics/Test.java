package com.rakuten.training.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		String[] nums = {"1", "2", "3" };
		Stream<String> stream = Stream.of(nums);
		List<Integer> ints = stream.map(s->Integer.parseInt(s)).collect(Collectors.toList());
		List<Double> doubles = stream.map(s-> Double.parseDouble(s)).collect(Collectors.toList());
		System.out.println(ints.size() + " " + doubles.size());
	}
}
