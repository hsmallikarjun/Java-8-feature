package Lamda_Expression;

import java.util.Arrays;
import java.util.List;

public class Map_demo1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("kiran","karthik","arun","varun");
		names.stream().map(k->k.toUpperCase()).forEach(System.out::println); //KIRAN,KARTHIK,ARUN,VARUN
		System.out.println("-----------------");
		
		names.stream().mapToInt(k->k.length()).forEach(System.out::println);//5,7,4,5
		
		names.stream().filter(n->n.startsWith("a")).map(k->k.toUpperCase()).forEach(System.out::println);//ARUN

	}

}
