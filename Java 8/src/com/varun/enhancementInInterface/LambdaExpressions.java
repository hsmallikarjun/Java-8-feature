package com.varun.enhancementInInterface;

/*Lambda Expressions:
 
	>It saves lots of code.
	>To provide the implementationfor functional interface.
	>We don't need to define the method again to provide the implementation.
	>It helps to iterate, filter, and extract data from collection.
	>Lambda is a anonymous function.i.e., No name, no modifier, no return type.
	
	ex 1:
	===
	public void fee(){
		s.o.p("50K");
	}
	
	() -> {s.o.p("50K")};  this can be written as () -> s.o.p("50K");
	
	ex 2:
	=====
	public void add(int a, int b){
		sop(s+b);
	}
	
	(a,b)->sop(a+b);

*/

@FunctionalInterface
interface KEA{
	public double fee(double fees);
	//public void display();   //CTE
}

@FunctionalInterface
interface KEA2{
	public void display(String name);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		double donation = 10_000;
		KEA v = (fees) -> fees+donation;
		System.out.println("Total fee amount :" + v.fee(58687.45));
		
		KEA2 kea = (name) -> System.out.println("name : " + name);
		kea.display("Varun");
	}

}
