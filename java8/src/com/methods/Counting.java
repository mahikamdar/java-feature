package com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {
public static void main(String[] args) {
	List<String> l = Arrays.asList("apples", "milk", "meat", "eggs", "juice");
	
	Long collect = l.stream().collect(Collectors.counting());
	System.out.println(collect);
	
	long count = l.stream().count();
	
	System.out.println(count);
}
}
