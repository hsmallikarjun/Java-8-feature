package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Limit_Skip_Demo {

	public static void main(String[] args) {
		
		List<String> lang = Arrays.asList("C#","Java","Python","Scala");
		
		lang.stream().limit(2).forEach(System.out::println);
		System.out.println("------------------------------");
		lang.stream().skip(1).forEach(System.out::println);
		System.out.println("-------------------------------");
		
		List<String> names = Arrays.asList("Kiran","Varun","Madhu","Kiran");
		names.stream().distinct().forEach(System.out::println);
		
	}

}
