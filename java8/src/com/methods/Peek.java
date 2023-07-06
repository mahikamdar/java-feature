package com.methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("one", "two", "three", "four");
		
//		List<String> l = s.filter(x->x.length()>3)
//				.peek(x-> System.out.println(x))
//				.map(y->y.toUpperCase())
//				.peek(x-> System.out.println(x))
//		.collect(Collectors.toList());
		//System.out.println(l);
	Employee e1=	new Employee("a", 1, 100.0);
	Employee e2=	new Employee("b", 2, 200.0);
	Employee e3=	new Employee("c", 3, 300.0);
	Stream.of(e1,e2,e3).peek(x->x.setName(x.getName()+"xyz")).forEach(x-> 
	   {x.setName(x.getName()+"mahendra");
		System.out.println(x.getName());
		}
		);
		
		
	}
}
