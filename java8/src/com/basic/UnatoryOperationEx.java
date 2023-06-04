package com.basic;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnatoryOperationEx {

	public static void main(String[] args) {
		
		UnaryOperator<Double> half = i->i/2;
		
         UnaryOperator<Double> mul = j->j*j;
		
		
		System.out.println(half.apply(16.0));
		System.out.println(mul.apply(16.0));
	}
}
