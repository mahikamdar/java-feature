package com.basic;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierEx {
	
	public static void main(String[] args) {
		Supplier<LocalDateTime> s = ()->LocalDateTime.now();
		LocalDateTime localDateTime = s.get();
		System.out.println(localDateTime);
		
	Supplier<Double> s2 = ()->Math.random();
		System.out.println(s2.get());
	}

}
