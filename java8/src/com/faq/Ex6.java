package com.faq;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex6 {
	public static void main(String[] args) {
		//Given a list of numbers, return the first 5 elements and their sum
		
		List<Integer> l = Arrays.asList(11,2,3,4,5,21,3);
		List<Integer> l1 = l.stream().limit(5).collect(Collectors.toList());
		System.out.println(l1);
		
		//or
		Integer i = l1.stream().reduce((x,y)->x+y).get();
		System.out.println(i);
		
		//Given a list of numbers, return the cube of each number
		Map<Integer, Integer> map = l1.stream().distinct().collect(Collectors.toMap(y->y, z->z*z*z));
		System.out.println(map);
		
		
		//order preserve
		Map<Integer, Integer> map1 = l1.stream().distinct().collect(Collectors.toMap(y->y, z->z*z*z,(y,z)->y,LinkedHashMap::new));
		System.out.println(map1);
		//
		Map<Integer, Integer> map2 = l1.stream().distinct().collect(Collectors.toMap(y->y, z->z*z*z,(y,z)->2*z,LinkedHashMap::new));
		System.out.println(map2);
		
		//Given a list of numbers, skip the first 5 elements and return their sum
				List<Integer> l8 = l.stream().skip(5).collect(Collectors.toList());
			 i = l8.stream().reduce((x,y)->x+y).get();
				System.out.println(i);
				
	}

}
