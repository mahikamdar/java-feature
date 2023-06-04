package com.basic;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionIAndThenComposeEx {

	public static void main(String[] args) {
		Function<Double,Double> half = i->i/2;
		
		Function<Double,Double> mul = j->j*j;
		
		//mean it will half and then multiply
		Function<Double,Double> f = half.andThen(mul);
		//compose mean first it will multiply then half
		Function<Double,Double> f1 = half.compose(mul);
		System.out.println(f.apply(16.0));
		System.out.println(f1.apply(16.0));
		
		// **************************
		// idnetity example
		Function<Integer,Integer> id = Function.identity();
	    System.out.println(id.apply(3));
	    // do not write generic
	    DoubleFunction half1 = i->i/2;
	    System.out.println(half1.apply(100));
	
	    
	    //***************************
		
		
	}
}
