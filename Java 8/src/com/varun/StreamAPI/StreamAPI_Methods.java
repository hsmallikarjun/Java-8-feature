package com.varun.StreamAPI;

import java.util.Arrays;
import java.util.List;

/*
 	Filtering with Streams:
 	
 	Filtering requried data from the original data.
 	To apply filter on the data, it provide filter() method
 	
 	Ex: Stream filter(Predicate p)
 */
public class StreamAPI_Methods {

	public static void main(String[] args) {
		
		//Filter Method:
		List<Integer> list = Arrays.asList(10,3,45,67,2,3,45,67);
		list.stream().filter(k -> k>10).forEach(System.out::println);
		
		
	}

}
