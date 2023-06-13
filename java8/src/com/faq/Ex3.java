package com.faq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex3 {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1,2,3,4,5);
	//Given a list of numbers, return the even and odd numbers separately
	List<Integer> even = l.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(even);
	List<Integer> odd = l.stream().filter(x->x%2!=0).collect(Collectors.toList());
System.out.println(odd);

//Given a list of numbers, find out all the numbers starting with 2

List<Integer> l1 = Arrays.asList(12,22,3,24,25);
List<Integer> n = l1.stream().filter(i->i.toString().startsWith("2")).collect(Collectors.toList());
System.out.println(n);

//Given a list of numbers, print the duplicate numbers
final List<Integer> l2 = Arrays.asList(12,22,3,24,22,22);
Set<Integer> set = l2.stream().filter(i->Collections.frequency(l2, i)>1).collect(Collectors.toSet());
System.out.println(set);

//or
Set<Integer> s = new HashSet<>();
Set s1 =l2.stream().filter(i->!s.add(i)).collect(Collectors.toSet());
System.out.println(s1);

}
}
