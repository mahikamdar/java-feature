package com.methods;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ForEachOrdered {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2, 4, 6, 8, 1);
	 
//	list.stream()//.parallel()
//	.forEach( System.out::print);    //1
//	 System.out.println();
//	 
//	list.stream().parallel().forEachOrdered( System.out::print ); //2
//	
	
	Set<Integer> m = new LinkedHashSet();
	list.stream().parallel().forEach(x->m.add(x));  
	System.out.println(m);
	
	
}
}
