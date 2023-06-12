package com.faq;

import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		//Given a list of numbers, return the average of all numbers
	//	List<Integer> l = Arrays.asList(1,2,3,4,5);
		
	//	List<Integer> l = new ArrayList();
	//	Integer i = l.stream().reduce((x,y)->x+y).get();
		//System.out.println(i/l.size());
		
//		double o = l.stream().mapToInt(a->a).average().orElse(0);
//		System.out.println(o);
		
		// Given a list of numbers, square them and filter the numbers
		//which are greater 100 
		//and then find the average of them
		List<Integer> l = Arrays.asList(1,20,3,4,50);
		
		double d = l.stream().mapToInt(b->b*b).filter(c->c>100).average().orElse(0);
		System.out.println(d);
		
		//Hw
		// find the average of number whose square is greater than 100
	}
}
