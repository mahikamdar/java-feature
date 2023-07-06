package com.methods;

import java.util.List;
import java.util.stream.Stream;

public class Reduce {
public static void main(String[] args) {
	 Stream<Integer> s = Stream.of(5, 10, 20, 50);
	 
	 Integer i = s.reduce((x,y)->x+y).get();
	// System.out.println(i);
	 
	 Stream<Integer> s1 = Stream.of(5, 10, 20, 50);
	 
	 Integer i1 = s1.reduce((x,y)->x-y).get();
	// System.out.println(i1);
	 
Stream<Integer> s2 = Stream.of(5, 10, 20, 50);
	 
	 Integer i2 = s2.reduce((x,y)->x*y).get();
	 //System.out.println(i2);
	// first square the no and sum 
	 //expected 3025
Stream<Integer> s3 = Stream.of(5, 10, 20, 50);
	 
	// Integer i3 = s3.map(m->m*m).reduce((x,y)->x+y).get();
	// System.out.println(i3);
	 
	 //add initial value 5 in above question
  // below method wont return Optional
Integer i3 = s3.map(m->m*m).reduce(5,(x,y)->x+y);
	// System.out.println(i3);



Stream<Integer> s4 = Stream.of(5, 1, 2, 5);

// pending of three parameter of reduce();
Integer i4 = s4.reduce(1,(x,y)->x*y,(x,y)->x/y);
 System.out.println(i4);
	 
	 
	 
List<String> sl=	 List.of("dddd", "a", "bb", "cccc","s");
	
//m - 1241, n - 41241, s- 1241
/*
 * Integer op = sl.stream().reduce(0, (x,y)->x., (x,y)->x+y);
 */
	   
	// System.out.println(op);  
	 
	 
}
}
