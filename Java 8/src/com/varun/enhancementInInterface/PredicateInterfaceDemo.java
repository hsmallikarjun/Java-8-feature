package com.varun.enhancementInInterface;

import java.util.function.Predicate;

/*
 	Predicate:
 	It is a predefined interface
 	>It is used to check condition and return true or false.
 	>It is having only one abstract method.
 	>test(T t)
 */

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));


	}

}
