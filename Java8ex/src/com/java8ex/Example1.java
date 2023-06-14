package com.java8ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("Old List " + l);

		List<Integer> list1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("Assending Order : " + list1);

		List<Integer> list2 = l.stream().sorted((x, y) -> -x.compareTo(y)).collect(Collectors.toList());
		System.out.println("Dissending Order Rule 1 : " + list2);
			//or
		List<Integer> list3 = l.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println("Dissending Order Rule 2 : " + list3);
			//or
		List<Integer> list4 = l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("dissending Order Rule 3 : " + list4);
	}
}
