package com.varun.enhancementInInterface;

interface VTU{
	
	//As we know we cannot write implementation code in method written in interface, i.e.,abstract method
	//But, in JAVA 8, we can write. 
	// use "default" with method and start writing method body.
	public default void fee() {
		System.out.println("fee 50k");
	}
}

class PES implements VTU{
	
	//here, don't use default keyword here.
	public void fee() {
		System.out.println("fee 70k");
	}
}

public class MethodImplementationInInterface {

	public static void main(String[] args) {
		
		//both method calling will invoke overriden method.
		//if no overriden method, it will invoke method in interface.
		VTU v = new PES();
		v.fee();
		
		PES p = new PES();
		p.fee();
	}

}
