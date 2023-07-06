package com.basic;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class AInfo1 {
         
//max(Comparotor) 
//Collector<A,B,Optional> maxBy(Comparator)    
//Collector       collectingAndThen(Collector<T,A,R> downstream,Function<R,RR> finisher)

// Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
	
// Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate, Collector<? super T, A, D> downstream)

//public static Collector<CharSequence, ?, String> joining()
	
//Stream.forEach(Consumer) but Map.forEach(BiConsumer)
	
// if you want to merge m1 into m2 then you have to call merge method on m2
//but the value you have to pass from m1
	
// in BiFunction input parameter will be value because it will take case when key is same 
	
//When BIFunction it will read whenever key will be same otherwise it will ignore
// map.merge(k,y,BiFunction)
//
	//Optional<T> reduce(BinaryOperator<T> accumulator);
}
