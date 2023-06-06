package com.basic;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperationEx {
public static void main(String[] args) {
	

	//BinaryOperator<Integer> bi = (x,y)->x+y;
	//System.out.println(bi.apply(10, 20));
	
	BinaryOperator<Integer> half = (x,y)->(x+y)/2;
	Function<Integer,Integer> mul = z->z*2;
	
	
	BiFunction<Integer,Integer,Integer> f1 =  half.andThen(mul);

	System.out.println(f1.apply(10, 20));
	
	//or
	
	//BinaryOperator<Integer> b =(BinaryOperator<Integer>)half.andThen(mul);
	
	
	
	
}
}
