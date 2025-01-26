package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		List<String> languages = Arrays.asList("c#","java","python","scala");
		List<String> ftech = Arrays.asList("html","css","javascript","react");
		
		List<List<String>> developer = Arrays.asList(languages,ftech);
		developer.stream().forEach(System.out::println);
		
		Stream<String> s1 = developer.stream().flatMap(s -> s.stream());
		s1.forEach(System.out::println);

	}

}
