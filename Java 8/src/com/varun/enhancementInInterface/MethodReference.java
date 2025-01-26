package com.varun.enhancementInInterface;

import java.util.ArrayList;
import java.util.List;

//Method Reference: It means reference to one method from another method.

@FunctionalInterface
interface VTU1{
	public void fee();
}

public class MethodReference {
	
	public static void location() {
		System.out.println("Fee = 50K location = Mysore");
	}

	public static void main(String[] args) {
		VTU1 v = MethodReference :: location;  //we are giving implementation to fee() method using location method using method reference concept.
		//MethodRefenrece is the class name which location method is present. and location is the method.
		v.fee();
		
		
		List<String> list = new ArrayList<>();
		list.add("Varun");
		list.add("Kiran");
		list.add("Tharun");
		
		list.forEach(n -> System.out.println(n));
		list.forEach(System.out::println); //Here, we are using method refernece to print all the values present in arraylist.
	}

}
