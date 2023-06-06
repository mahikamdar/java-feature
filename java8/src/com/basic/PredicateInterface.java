package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
public static void main(String[] args) {
	
	Predicate<Integer> p = x->x%2==0;
	  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
	  List<Integer> op = list.stream().filter(p).collect(Collectors.toList());
 System.out.println(op);
 // find even no. and find sum of square of numbers(4+16+36 =56)
 int sum = list.stream().filter(p).map(y->y*y).reduce(0,(a,b)->a+b).intValue();
 
 //or
 list.stream().filter(p).mapToInt(y->y*y).sum();
 
 //or
 
 list.stream().filter(p).map(y->y*y).reduce(0,Integer:: sum).intValue();
 
 //or 
 
 System.out.println(sum);
}
}