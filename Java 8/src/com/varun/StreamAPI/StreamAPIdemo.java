package com.varun.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 	Stream API:
 	
 	>Stream API used to process the data.
 	>Collections are used to store the data.
 	>It can be defined as sequence of elements that comes from source.
 	>Source of data from a stream can be Array or Collection.
 	>Stream is not a data Structure
 	>Stream means bunch of operation applied on source data.
 	>Stream will not change the original data structure of the source.
 	
 	object creation of Stream
 	>Stream.of(data1,data2,....);
 	>stream()
 	
 	Stream opeartion:
 	>It provides several method to perform operation on data.
 	
 	Stream API method of 2 type:
 	
 	1.Intermediate Operational Methods:
 	>It will perform opeartions on the stream and return a new stream.
 	
 	ex: filter(), map(),...
 	
 	2.Terminal Opeartional Methods:
 	It will take the input and will provide result as the output.
 	
 	Ex: count().
 	
 	
 	
 	
 */

public class StreamAPIdemo {

	public static void main(String[] args) {
		
		/*
		 
		Stream<Integer> st = Stream.of(10,20,4,67,34);
		//st.forEach(System.out::println);
		
		st.sorted().forEach(System.out::println);
		
		*/
		
		List<String> li = new ArrayList<>();
		li.add("Varun");
		li.add("Kiran");
		li.add("Arun");
		
		Stream<String> s1 = li.stream();
		s1.forEach(System.out::println);
	}

}
