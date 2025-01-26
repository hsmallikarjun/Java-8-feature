package Lamda_Expression;


//1. Its saves lots of code.
//2.To Provide the implementation for functional interfaces.
//3.We don't need to define the method again to provide the implementation.
//4.It helps to iterate ,filter and Extract data from Collection.
//5. Lamda is an annonymous function.
// -no name,no modifier,no return type.
	
//	ex:- public void fee(){
//	sop("50k");
//}
//	-----
//()-> {sop("50k")};

//Note :- when we have a single line in body then curly braces are optional.
//()-> sop("50k");
	
	//-----------------------------------
//public void add(int a,int b) {
//	sop(a+b);
//	
//}
//----------------------
//
//(int a,int b) -> {sop(a+b)};
//
//or
//
//(int a,int b) -> sop(a+b);
//
//or
//(a,b)-> sop(a+b);
	
	//-----------------------------------
//	@funcational interfaces
//interface vtu{
//	public double fee(double fe) ;
//}
//
//	
//
//public class LamdaExpreesion {
//	
//	public static void main(String...k) {
//		vtu v=(fe) -> {
//			return fe+100;
//		};
//		System.out.println("fee amt="+v.fee(30000.5));
//	}
//}

@FunctionalInterface
interface vtu{
	public void display(String name) ;
//	void show(); //CTE
}

	

public class LamdaExpreesion {
	
	public static void main(String...k) {
		
//		vtu v=(fe) -> {
//			System.out.println("name =" +fe);
//		};
		
		vtu v = (fe) -> System.out.println("name =" +fe); //when we use single sysout we dont need {}
		v.display("Malli1");
		
	}
}
	
	

