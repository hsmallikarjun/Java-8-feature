package Lamda_Expression;
//Filtering with Streams:

import java.util.Arrays;
import java.util.List;

//Filtering required data from the original data.
//To apply filter on the data ,it provided filter().
//ex:- Steam filter(Predicate p)

public class FilterCondition {
public static void main(String[] args) {
	List<Integer> al=Arrays.asList(10,3,28,19);
	al.stream().filter(k -> k>10).forEach(System.out::println);//28,19
	}
}
