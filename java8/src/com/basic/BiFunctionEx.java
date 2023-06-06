package com.basic;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionEx {
	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bi = (x,y)->x+y;
		//System.out.println(bi.apply(10, 20));
		
		BiFunction<Integer,Integer,Integer> half = (x,y)->(x+y)/2;
		Function<Integer,Integer> mul = z->z*2;
		
		BiFunction<Integer,Integer,Integer> f1 = half.andThen(mul);
		
		System.out.println(f1.apply(5, 10));
		
	}

} 

