package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo1 {

	public static void main(String[] args) {

		List<Users> u = (List<Users>) Stream.of(new Users("Karthik","12345",Arrays.asList("k@gmail.com","k1@gmail.com")),new Users("Divya","5643245",Arrays.asList("d@gmail.com","d1@gmail.com"))).collect(Collectors.toList());
		
		List<String> pno = (List<String>) u.stream().map(Users::getPhone).collect(Collectors.toList());
		System.out.println(pno);
		List<List<String>> em = (List<List<String>>) u.stream().map(Users::getEmail).collect(Collectors.toList());
		System.out.println(em);
		
		List<String> email =  (List<String>) u.stream().flatMap(k -> k.getEmail().stream().collect(Collectors.toList()));
		System.out.println();
	}
}
