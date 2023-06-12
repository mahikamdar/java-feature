package com.faq;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ex1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,7,8,9,5,2,36,4,78,222,24,9);
		
		BinaryOperator<Integer> b = (x,y)->x+y;
		//1) Given a list of numbers, return the sum of all numbers.
		int intValue = l.stream().reduce(b).get();
		
		 int intValue2 = l.stream().reduce(0,b).intValue();
		System.out.println(intValue);
		System.out.println(intValue2);
		
		//
	
		
	}

}
