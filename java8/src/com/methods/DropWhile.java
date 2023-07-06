package com.methods;

import java.util.stream.Stream;

public class DropWhile {
public static void main(String[] args) {
	Stream.of(1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1)
    .filter(i -> i < 4 )
    .forEach(System.out::print);
	System.out.println();
	
	// drop till condition match
	Stream.of(1,2,3,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1,1,2,3,3)
    .dropWhile(i -> i < 4 )
    .forEach(System.out::print);
}
}
