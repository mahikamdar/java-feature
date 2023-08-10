package com.basic;

import java.util.stream.Stream;

public class Skip {
public static void main(String[] args) {
	//Stream.iterate(50,i->i>0,n->n-2).skip(10).forEach(System.out::println);
	
	
	// I want data from 20 to 10
//	Stream.iterate(50,i->i>=10,n->n-2).skip(15).forEach(System.out::println);
 // or
	Stream.iterate(50,i->i>0,n->n-2).skip(15).limit(6).forEach(System.out::println);
}
}
