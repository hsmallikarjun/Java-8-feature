package Lamda_Expression;

import java.util.ArrayList;
import java.util.List;

//Method reff:-
//It means refference to one method from another method.

@FunctionalInterface
interface vtu1{
	public void fee();
}
public class Ex3byusingMethodreff {
	public static void location() {
		System.out.println("fee=50k location =mysore");
	}
	public static void main(String[] args) {
		//Method reff:-
		vtu1 v=Ex3byusingMethodreff::location;
		v.fee();
	}
	
//	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
//		list.add("Malli");
//		list.add("VArun");
//		list.add("YAsh");
//		list.add("Bahrgav");
//		
//		list.forEach(n->System.out.println(n));
//		list.forEach(System.out::println);
//out:-VArun
//		YAsh
//		Bahrgav
//		Malli
//		VArun
//		YAsh
//		Bahrgav

	}

