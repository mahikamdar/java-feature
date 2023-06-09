package com.basic;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateMethod3 {
public static void main(String[] args) {
	Predicate<String > p = Predicate.isEqual("mahi");
	//System.out.println(p.test("neeraj"));
	System.out.println(p.test("mahi"));
	
}
}
