package com.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teeing {
public static void main(String[] args) {
	List<Employee> l = Arrays.asList(
            new Employee("A",1 , 200.0),
            new Employee("B",2 , 100.0),
            new Employee("C",3 , 300.0),
            new Employee("D",4 , 400.0));
	
     // make map of max and min salary 
//	Map<String, Double> out = l.stream().collect(Collectors.
//			teeing(Collectors.maxBy(Comparator.
//					comparing(Employee:: getSalary)),
//					Collectors.minBy(Comparator.
//							comparing(Employee:: getSalary)), (e1,e2)->
//			{
//				Map<String,Double> map =new HashMap();
//				map.put("max", e1.get().getSalary());
//				map.put("min", e2.get().getSalary());
//				return map;
//				
//			}));
//	
//	System.out.println(out);
	
	//count employee whose salary is greater than 200 and get the list of 
	// that employees
	
	Map<String, Object> map1 = l.stream().collect(Collectors.
			teeing(Collectors.filtering(e->e.getSalary()>200,
					Collectors.toList()), 
					Collectors.filtering(e->e.getSalary()>200,
							Collectors.counting()), (x,y)->{
								
								Map<String,Object> m = new HashMap();
								m.put("list of employee", x);
								m.put("count ", y);
								
								return m;
							}));
	
	System.out.println(map1);
}
}
