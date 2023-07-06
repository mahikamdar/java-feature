package com.basic;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class AInfo2 {
	//this method will work on .parallel() and we are not very sure
	// about BinaryOperator 
	
// <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator,
 //   BinaryOperator<U> combiner);
	
//	Collector<T, ?, U> reducing(U identity, Function<? super T, ? extends U> mapper,
//    BinaryOperator<U> op)
	
	// in reducing() second parameter is  function but in reduce() BiFunction
	
	//take 2 question and give 1 ans  
	// 2 question two collectors as parameter
	// by 2 question one output that's why third parameter is BiFunction
	//Collector<T, ?, R> teeing(Collector<? super T, ?, R1> downstream1,
   // Collector<? super T, ?, R2> downstream2,
  //  BiFunction<? super R1, ? super R2, R> merger)
	
	
	//Stream<T> peek(Consumer<? super T> action);  
	//void forEach(Consumer<? super T> action);

}
