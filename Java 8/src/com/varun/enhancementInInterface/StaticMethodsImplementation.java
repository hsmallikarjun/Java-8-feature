package com.varun.enhancementInInterface;

interface PS{
	static void placement() {
		System.out.println("Trust the process");
	}
}

class PentagonSpace implements PS{
	static void placement() {
		System.out.println("Don't worry about placement");
	}
}

public class StaticMethodsImplementation {

	public static void main(String[] args) {
		
		PS s = new PentagonSpace();
		//s.placement();   -> CTE
		//we can't override the static methods
		//so, use interface name to call static method
		PS.placement();
		
		PentagonSpace p = new PentagonSpace();
		p.placement();  //it is not good way to call static method, use classname always.
		
	}

}
