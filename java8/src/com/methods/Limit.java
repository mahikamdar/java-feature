package com.methods;

import java.util.stream.Stream;

// Getting first 10 even numbers from an infinite stream of even numbers
public class Limit {
public static void main(String[] args) {
	//Stream.iterate(0,n->n+2).limit(10).forEach(System.out::println);
	
	Stream.iterate(0,i-> i%2==0,n->n+2).limit(10).forEach(System.out::println);
}
}
