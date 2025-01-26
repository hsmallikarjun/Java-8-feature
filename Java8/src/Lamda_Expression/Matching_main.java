package Lamda_Expression;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

public class Matching_main {
	public static void main(String[] args) {
		Matching_Operation b1=new Matching_Operation("Malli","India");
		Matching_Operation b2=new Matching_Operation("Yash","Africa");
		Matching_Operation b3=new Matching_Operation("Varun","US");
		Matching_Operation b4=new Matching_Operation("Bhargav","UK");
		
		List<Matching_Operation> list=Arrays.asList(b1,b2,b3,b4);
		
		boolean b5=list.stream().anyMatch(k->k.country.equals("India"));
		System.out.println(b5); //true

		boolean b6=list.stream().allMatch(k->k.country.equals("Germany"));
		System.out.println(b6); //false

		
		boolean b7=list.stream().noneMatch(k->k.country.equals("Germany"));
		System.out.println(b7); //true
	}

}
