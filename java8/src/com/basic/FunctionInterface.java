package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterface {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5);
		//Function<Integer,Integer> f = i->i*5;
		Function<Integer,Integer> f = new Function() {
			public Object apply(Object in) {
				Integer i = (Integer)in;
				return i*5;
			}
		};
	
		
		//List<Integer> op = l.stream().map(f).collect(Collectors.toList());
		List<Integer> op = l.stream().map(i->i*5).collect(Collectors.toList());
		//List<Integer> op = l.stream().map(new FunctionInterface() :: neeraj).collect(Collectors.toList());
		System.out.println(op);
		
	}
	
	 Integer neeraj(Integer i){
		return i*5;
		
	}
}
