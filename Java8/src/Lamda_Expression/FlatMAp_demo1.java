package Lamda_Expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// used to convert list of stream into single stream --Flatmap()
public class FlatMAp_demo1 {
public static void main(String[] args) {
	List<String> lan=Arrays.asList("c#","java","scala");
	List<String> ftech=Arrays.asList("html","css","react","angular");
	List<List<String>> dev=Arrays.asList(lan,ftech);
	dev.stream().forEach(System.out::println); //[c#, java, scala]
											//	[html, css, react, angular]
	
	Stream<String> s1=dev.stream().flatMap(s->s.stream());
	s1.forEach(System.out::println);//c#
									//	java
									//	scala
									//	html
									//	css
									//	react
									//	angular
	
}
}
