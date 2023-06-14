package com.java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1Java7VsJAva8 {

	public static void main(String[] args) {

		// Given a list of numbers, square them and filter the numbers
		// which are greater 100
		// and then find the average of them
		List<Integer> l = Arrays.asList(9, 2, 3, 40, 50);
		List<Integer> ls = new ArrayList<Integer>();
		for (int squrt : l) {
			int s = squrt * squrt;
			// System.out.println("Result: "+s);

			if (s >= 100) {
				// System.out.println(s);
				ls.add(s);

			}

		}
		int sum = 0;
		for (int avg : ls) {
			sum = sum + avg;

		}
		System.out.println("Result: "+sum / ls.size());

		// java8
		System.out.println("-------------------------JAva 8");
		List<Integer> ls1 = Arrays.asList(9, 2, 3, 40, 50);

		double ans = ls1.stream().mapToInt(b -> b * b).filter(c -> c > 100).average().orElse(0);

		System.out.println("Result: " + ans);
		
		String name="Neeraj";
		
		Map<Character, Long> collect = name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		Set<Character> set=new HashSet<>();
		Set<Boolean> collect2 = name.chars().mapToObj(c->!set.add((char)c)).collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println(collect2);
		
	}

}
