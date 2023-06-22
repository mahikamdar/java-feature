package com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		// Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> l =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        System.out.println(l);
        List<Integer> collect = l.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(collect);
        
        List<Integer> collect2 = l.stream().collect(Collectors.flatMapping(x->x.stream(), Collectors.toList()));
        System.out.println(collect2);
        
        
	}
}
