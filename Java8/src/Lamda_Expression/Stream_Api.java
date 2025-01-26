package Lamda_Expression;

import java.util.ArrayList;
import java.util.stream.Stream;

//Stream Api:-
//Stream api used to process yhe data.
//Collection are used to store the data.

//It can be defined as Sequence of elements that comes from the source.
//Source of data from stream can be Array or Collection.

//Stream is not a data structure.
//Stream means bunch of operation applied on source data.
//Source can be collection or array.
//Stream will not change the original data structure of the source.
//(it will just process the data given by the source.)

//Stream Operation:

//It provided several method to perform operations on the data.
//
//Stream api method of 2 types:
//
//1.intermediate Operational Methods
//
//it will perform operations on the stream and returns a new stream
//
//Ex: filter(), map() etc...
//
//2. Terminal operational method
//
//It will take the input and will provide result as the output
//
//Ex: count ()




public class Stream_Api {
	public static void main(String[] args) {
		
	
//	Stream<Integer> st=Stream.of(10,3,28,19); //10,3,28,19
//	st.forEach(System.out::println);
//	
//	System.out.println("-------------");
//	st.sorted().forEach(System.out::println); 3,10,19,28
		
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Malli");
		al.add("MAruthi");
		al.add("Varun");
		System.out.println("-------------");
		Stream<String> sl=al.stream();
		sl.forEach(System.out::println);//Malli,MAruthi,Varun
	}
}
