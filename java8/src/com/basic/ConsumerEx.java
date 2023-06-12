package com.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> c1 = c->System.out.println(c);
		List<String> l = Arrays.asList("mahendra","neeraj","sadhanand");
		
	//	l.stream().forEach(c1);
	//	l.stream().forEach(System.out:: println);
	//	l.stream().forEach(c->System.out.println(c));
	//	c1.accept("Mahendra");
		
		
		   Consumer<String> consumer1 = (x) -> System.out.println(x.toLowerCase()+"Mahi");
		   Consumer<String> consumer2 = (x) -> System.out.println(x.toUpperCase());
		   consumer1.andThen(consumer2).accept("Java2s.com");
	}
}
