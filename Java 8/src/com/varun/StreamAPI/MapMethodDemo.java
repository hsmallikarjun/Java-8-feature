package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MapMethodDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Kiran","Karthik","Varun","Arun");
		names.stream().map(k -> k.toUpperCase()).forEach(System.out::println);
		
		names.stream().mapToInt(k -> k.length()).forEach(System.out::println);
		
		names.stream().filter(n -> n.startsWith("K")).map(k -> k.toUpperCase()).forEach(System.out::println);
	}

}
