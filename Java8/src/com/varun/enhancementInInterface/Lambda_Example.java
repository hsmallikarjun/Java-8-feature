package com.varun.enhancementInInterface;

@FunctionalInterface
interface GMIT{
	void show();
}

public class Lambda_Example implements GMIT{

	public static void main(String[] args) {
		GMIT gmit = new Lambda_Example();
		gmit.show();
		
		GMIT g = () -> System.out.println("Welcome");
		g.show();
	}

	@Override
	public void show() {
		System.out.println("Welcome To GMIT college");
	}

}
