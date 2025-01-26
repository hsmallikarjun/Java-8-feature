package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MatchMethods {

	public static void main(String[] args) {
		
		Book b1 = new Book("Karthik", "India");
		Book b2 = new Book("Kiran","Aus");
		Book b3 = new Book("Varun","UK");
		Book b4 = new Book("Vidya", "US");
		
		List<Book> list = Arrays.asList(b1,b2,b3,b4);
		
		boolean value = list.stream().anyMatch(k -> k.country.equals("India"));
		System.out.println(value);
		
		boolean value1 = list.stream().allMatch(k -> k.country.equals("Aus"));
		System.out.println(value1);
		
		boolean value2 = list.stream().noneMatch(k -> k.country.equals("Germany"));
		System.out.println(value2);
	}

}
