package com.methods;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToConcurrentMap {

	public static void main(String[] args) {
//		 Stream<String> s = Stream.of("apple", "banana", "orange","baigan");
//		 ConcurrentMap<Character, String> output = s.collect(Collectors.toConcurrentMap(x->x.charAt(0), y->y.toUpperCase()));
//		 System.out.println(output);
//		 
		 Stream<String> a = Stream.of("apple", "banana", "orange","baigan");
		 ConcurrentMap<Character, String> collect = a.collect(Collectors.toConcurrentMap(x->x.charAt(0), y->y.toUpperCase(), (c,b)->b));
	System.out.println(collect);
	System.out.println(collect.getClass().getName());
	
	 
	
//	  Stream<String> s = Stream.of("apple", "banana", "apricot", "orange");
//      Map<Character, String> m = s.collect(
//                          Collectors.toConcurrentMap(s1 -> s1.charAt(0),
//                                              String::toUpperCase,
//                                              (s1, s2) -> s1 + "|" + s2));
//      System.out.println(m.getClass().getName());
	}
}
