package com.faq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		
		//Given a list of numbers, sort them in ASC and DESC order and print
		
		List<Integer> l = Arrays.asList(11,2,3,4,5);
		
		List<Integer> list = l.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> l2 = l.stream().sorted((x,y)->-x.compareTo(y)).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3 = l.stream().sorted((x,y)->y.compareTo(x)).collect(Collectors.toList());
		System.out.println(l3);
		
		List<Integer> list1 = l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list1);
	}
}
