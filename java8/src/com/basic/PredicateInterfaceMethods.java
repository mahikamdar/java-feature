package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceMethods {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
	
	// requirement- filter number which is greater than 5 and even also
	
	Predicate<Integer> p1 = i->i%2==0;
	Predicate<Integer> p2 = j-> j>5;
	
	List<Integer> o1 = l.stream().filter(p1.and(p2)).collect(Collectors.toList());
 System.out.println(o1);
 
 // orMethod
 List<Integer> o2 = l.stream().filter(p1.or(p2)).collect(Collectors.toList());
 System.out.println(o2);
//odd number or lessthan or equal to 5
 List<Integer> o3 = l.stream().filter(p1.or(p2).negate()).collect(Collectors.toList());
 System.out.println(o3);
 
 
}
}
