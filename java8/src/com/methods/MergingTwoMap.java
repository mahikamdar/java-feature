package com.methods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MergingTwoMap {

	public static void main(String[] args) {
		Map<String, Employee> m1 = new LinkedHashMap<>();
		Map<String, Employee> m2 = new LinkedHashMap<>();
		
		Employee e1 = new Employee ("Henry",1,1.1);
		Employee e2 = new Employee ("deepak",2,1.1);
		Employee e3 = new Employee ("neeraj",3,1.1);
		m1.put(e1.getName(), e1);
		m1.put(e2.getName(), e2);
		m1.put(e3.getName(), e3);
		
		Employee e4 = new Employee ("mahi",4,1.1);
		Employee e5 = new Employee ("sadanand",5,1.1);
		m2.put(e4.getName(), e4);
		m2.put(e5.getName(), e5);
		//duplicate key
		Employee e6 = new Employee ("neeraj",30,100.1);
		m2.put(e3.getName(), e6);
		
		Map<String, Employee> m3 = new LinkedHashMap<>(m1);
		
		// if you want to merge m1 into m2 then you have to call merge method on m2
		//but the value you have to pass from m1
		
		//forEach(BiConsumer)
		// V merge(K,Y,BiFunction)
		m2.forEach((k,v)->m3.merge(k, v,
				(v1,v2)->new Employee(v1.getName(),v2.getAge(),v1.getSalary())));
	
		//System.out.println(m3);
		
	//Exchange key and value and merge into single map
		
		Map<Employee, String> m4 = new LinkedHashMap<>();
		m1.forEach((x,y)-> m4.merge(y, x, (v1,v2)-> v2));
//		System.out.println(m1);
//		System.out.println(m4);
		m2.forEach((x,y)-> m4.merge(y, x, (v1,v2)-> v2));
		System.out.println(m2);
		System.out.println(m4);
		
		 
	}
}
