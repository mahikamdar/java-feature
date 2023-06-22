package com.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AllMatch {

	public static void main(String[] args) {
		Predicate<Student> s1 = a->a.stuId<50;
		Predicate<Student> s2 = a1->a1.stuAge>40;
		Predicate<Student> s3 = s1.and(s2);
		Predicate<Student> s4 = a->a.stuAge<40 && !a.stuName.startsWith("X");
		
//		Stream<Student> s = Student.getStudents().stream();
//		System.out.println(s.allMatch(s1));
//		System.out.println(s.allMatch(s2));
//		System.out.println(s.allMatch(s3));
//		System.out.println(s.allMatch(s4));
		
		List<Student> l = Student.getStudents();
		System.out.println(l.stream().allMatch(s1));
		System.out.println(l.stream().allMatch(s2));
		System.out.println(l.stream().allMatch(s3));
		System.out.println(l.stream().allMatch(s4));
//		 list.add(new Student(11, 28, "Lucy")); 
//	      list.add(new Student(28, 27, "Tim")); 
//	      list.add(new Student(32, 30, "Daniel")); 
//	      list.add(new Student(49, 27, "Steve")); 
		
	}
}
class Student{
	   int stuId; 
	   int stuAge;  
	   String stuName;  
	   Student(int id, int age, String name){
	      this.stuId = id;   
	      this.stuAge = age;  
	      this.stuName = name;  
	   }  
	   public int getStuId() { 
	      return stuId;  
	   }  
	   public int getStuAge() {  
	      return stuAge;  
	   } 
	   public String getStuName() {  
	      return stuName;  
	   }  
	   public static List<Student> getStudents(){ 
	      List<Student> list = new ArrayList<>(); 
	      list.add(new Student(11, 28, "Lucy")); 
	      list.add(new Student(28, 27, "Tim")); 
	      list.add(new Student(32, 30, "Daniel")); 
	      list.add(new Student(49, 27, "Steve")); 
	      return list; 
	   }
	}