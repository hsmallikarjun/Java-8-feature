package Lamda_Expression;

import java.util.Arrays;
import java.util.List;

public class Limit_Skip_Distinct {
	public static void main(String[] args) {
		List<String> lang=Arrays.asList("c#","java","python","scala");
		
		lang.stream().limit(2).forEach(System.out::println); 
//		output:
//			c#
//			java
		System.out.println("-------------------------");
		lang.stream().skip(2).forEach(System.out::println); 
//		output:
//		python
//		scala
		
		System.out.println("-------------------------");

		List<String> names=Arrays.asList("Malli","Yash","Bhargav","Varun","Malli");
		names.stream().distinct().forEach(System.out::println); 
//		output:
//		Malli
//		Yash
//		Bhargav
//		Varun
	}

}
