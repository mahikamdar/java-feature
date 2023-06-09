package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//what is diff between not and negate

// ans -> negate har ak element to not bnata hai jabki not kisi ak element
// ko hi not banata hai
public class PredicateMethods2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		Predicate<Integer> isEven = i -> i % 2 == 0;
		 
		Predicate<Integer> isOdd = Predicate.not( isEven );
		
		Predicate<Integer> isOdd1 = isEven.negate();

		List<Integer> evenNumbers = list.stream()
		      .filter(isEven)
		      .collect(Collectors.toList());
		System.out.println(evenNumbers);
		 
		List<Integer> oddNumbers = list.stream()
		    .filter(isOdd)
		    .collect(Collectors.toList());
		
		System.out.println(oddNumbers);
		
		List<Integer> oddNumbers1 = list.stream()
			      .filter(isOdd1)
			      .collect(Collectors.toList());
		System.out.println(oddNumbers1);
		
		
	}
}
