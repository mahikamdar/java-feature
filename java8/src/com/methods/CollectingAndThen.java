package com.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingAndThen {

	public static void main(String[] args) {
		  List<Employee> l
	      = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
	      new Employee("Tom Jones", 45, 7000.00),
	      new Employee("Ethan Hardy", 65, 8000.00),
	      new Employee("Nancy Smith", 22, 10000.00),
	      new Employee("Deborah Sprightly", 29, 9000.00));
	//find maxSalary
		  
		 String name1 = l.stream().collect(Collectors.collectingAndThen(Collectors.maxBy((x,y)->x.getSalary().compareTo(y.getSalary())),
				 z->z.isPresent()?z.get().getName() : "none")) ;
		 String name2 = l.stream().collect(
			        Collectors.collectingAndThen(
			            Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
			            (Optional<Employee> emp)-> emp.isPresent() ? emp.get().getName() : "none") );
		 
		 
		 System.out.println(name1);
		 System.out.println(name2);
		 
		 String name = l.stream().max(Comparator.comparing(Employee::getSalary)).get().getName();
		 System.out.println(name);
		 
		 
			    
	}
}
