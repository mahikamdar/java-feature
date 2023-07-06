package com.methods;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reducing {
public static void main(String[] args) {
	
	
        Stream<Integer> s = Stream.of(5, 10, 20, 50);
        Integer i = s.collect(Collectors.reducing((integer, integer2)
                            -> integer2 - integer))
                     .orElse(-1);

        System.out.println(i);
        
        Stream<Integer> s1 = Stream.of(5, 10, 20, 50);
           
        
        String out = s1.collect(Collectors.reducing("",x->Integer.toString(x),
        		(x,y)->x+y));
        System.out.println(out);
        
        
}
}
