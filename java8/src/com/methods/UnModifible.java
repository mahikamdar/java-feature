package com.methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UnModifible {

	public static void main(String[] args) {
		 List<Integer> collect = IntStream.range(5, 10).boxed().collect(Collectors.toUnmodifiableList());
		System.out.println(collect.getClass().getName());
	}
}
