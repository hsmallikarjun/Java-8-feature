package com.varun.StreamAPI;

import java.util.stream.Stream;

public class FilterOnUser {

	public static void main(String[] args) {
		
		User u1 = new User("Kiarn",10);
		User u2 = new User("Varun",22);
		User u3 = new User("Arun",18);
		User u4 = new User("Kavya",25);
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4);
		stream.filter(k -> k.age >17 && k.name.startsWith("K")).forEach(System.out::println);
		
	}

}
