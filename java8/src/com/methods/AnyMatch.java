package com.methods;

import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {
		// to check that element is contains or not
		
		Stream<String> s = Stream.of("one","two","three","four");
		  boolean anyMatch = s.anyMatch(a->a.contains("four"));
		  System.out.println(anyMatch);
		  
	}
}
