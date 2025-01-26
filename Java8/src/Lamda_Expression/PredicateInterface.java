package Lamda_Expression;
//PRIDICATE:-
//It is a predifined interface .
//it is used to check condition and return true or false value.
//Predicate interface having only one abstarct method.
//test(T t).
import java.util.*;
import java.util.function.Predicate;

public class PredicateInterface {
	public static void main(String[] args) {
		Predicate<Integer> p=i -> i>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));

	}

}
