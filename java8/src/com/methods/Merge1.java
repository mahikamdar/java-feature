package com.methods;

//Java program to demonstrate
//computeIfAbsent(Key, Function) method.

import java.util.*;

public class Merge1 {

	// Main method
	public static void main(String[] args)
	{

		// create a HashMap and add some values
		HashMap<String, String> map1 = new LinkedHashMap<>();
		map1.put("1", "L");
		map1.put("2", "M");
		map1.put("3", "N");

		HashMap<String, String> map2 = new LinkedHashMap<>();
		map2.put("1", "B");
		map2.put("2", "M");
		map2.put("3", "R");
		map2.put("4", "S");

		// print map details
		System.out.println("HashMap1: " + map1.toString());

		System.out.println("HashMap2: " + map2.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
//		map2.forEach(
//			(a, b)
//				-> map1.merge(a, b,
//							(v1, v2)
//								-> v1.equalsIgnoreCase(v2)
//										? v1
//										: v1 + " 100" + v2));
//
//		// print new mapping
//		System.out.println("New HashMap: " + map1);
		
		map2.forEach(
				(a, b)
					-> map1.merge(b, a,
								(v1, v2)
									-> v1.equalsIgnoreCase(v2)
											? v1
											: v1 + " 100" + v2));

			// print new mapping
			System.out.println("New HashMap: " + map1);
	}
}
