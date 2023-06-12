package com.basic;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class BiPredicateMethods {
public static void main(String[] args) {
BiPredicate<String, Integer> b = (x,y)->x.length()==y;
	
	//System.out.println(b.test("mahendra", 3));
	
	//System.out.println(b.test("mahendra", 8));
	
	BiPredicate<String, Integer> b1 = (x,y)->x.length()<y;
	
	BiPredicate<String, Integer> output1 = b1.and(b);
	
	BiPredicate<String, Integer> output2 = b1.or(b);
	
	BiPredicate<String, Integer> output3 = output2.negate();
	
	BiPredicate<String, Integer> output4 = output1.negate();
	
//	System.out.println(output1.test("neeraj", 6));
//	System.out.println(output4.test("neeraj", 6));
//	System.out.println(output2.test("neeraj", 6));
//	System.out.println(output3.test("neeraj", 6));
	
	IntPredicate b4 = x->x>5;
	
	System.out.println(b4.test(10));
	
}
}
