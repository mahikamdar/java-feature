package com.faq;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(11,2,3,4,5);
		
		//Given a list of numbers, print the maximum and minimum values
		int min = l.stream().mapToInt(i->i).min().getAsInt();
		
		System.out.println(min);
		
      int max = l.stream().mapToInt(i->i).max().getAsInt();
		
		System.out.println(max);
		
		Integer min1 = l.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(min1);
		
		Integer max1 = l.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(max1);
		
		Integer min2 = l.stream().collect(Collectors.minBy((x,y)->x.compareTo(y))).get();
		System.out.println(min2);
		
		Integer max2 = l.stream().collect(Collectors.maxBy((x,y)->x.compareTo(y))).get();
		System.out.println(max2);
		
		Integer min3 = l.stream().min(Comparator.comparing(j->j)).get();
		System.out.println(min3);
		
		Integer min4= l.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println(min4);
		
		Integer max4= l.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println(max4);
	}
}
