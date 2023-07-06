package com.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {

	public static void main(String[] args) {
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's' };
		String string = Stream.of(ch).map(x->String.valueOf(x)).collect(Collectors.joining());
		//System.out.println(string);
		
		//not working
		 String string1 = Stream.of(ch).map(x->String.valueOf(x)).collect(Collectors.joining(","));
		// System.out.println(string1);
		 
		 List<Character> ch1 = Arrays.asList('G', 'e', 'e', 'k', 's', 'f',
                 'o', 'r', 'G', 'e', 'e', 'k', 's');
		 
		 //not working for stream object
		 String chString =  Stream.of(ch1).map(String::valueOf).collect(Collectors.joining("/"));
		// System.out.println(chString);
		 
		 //working for stream() method
		 String chString1 =  ch1.stream().map(String::valueOf).collect(Collectors.joining("/"));
		 //System.out.println(chString1);
		 
		 //three parameter first will add in middle, second parameter will add in first place and
		 // last parameter will add in last place
		 String chString2 =  ch1.stream().map(String::valueOf).collect(Collectors.joining("*","$","%"));
		 System.out.println(chString2);
		
	}
}
