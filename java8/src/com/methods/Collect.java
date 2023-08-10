package com.methods;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
public static void main(String[] args) {
	List<String> l = Arrays.asList("a", "bb", "c", "d", "bb");
	List<String> collect = l.stream().collect(Collectors.toList());
	System.out.println(collect.getClass().getName());// output is coming in ArrayList
	
	//but I want to hold in LinkedList
	List<String> l1 = Arrays.asList("a", "bb", "c", "d", "bb");
	List<String> collect1 = l1.stream().collect(Collectors.toCollection(LinkedList:: new));
	System.out.println(collect1.getClass().getName());
	
	List<String> l2 = Arrays.asList("a", "bb", "c", "d", "bb");
	Set<String> collect2 = l2.stream().collect(Collectors.toSet());
	System.out.println(collect2.getClass().getName());
	System.out.println(collect2);
	
	List<String> l3 = Arrays.asList("a", "bb", "c", "d", "bb");
	Set<String> collect3 = l3.stream().collect(Collectors.toCollection(LinkedHashSet :: new));
	System.out.println(collect3.getClass().getName());
	System.out.println(collect3);
}
}
