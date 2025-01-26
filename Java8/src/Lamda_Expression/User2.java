package Lamda_Expression;

import java.util.stream.Stream;

public class User2 {
	public static void main(String[] args) {
		User u1=new User("Malli",10,35000); 
		User u2=new User("Varun",15,15000); 
		User u3=new User("YAsh",25,10000); 
		User u4=new User("Bhargav",35,5000); 
		User u5=new User("Maru",50,10000);
		
		Stream <User> stream=Stream.of(u1,u2,u3,u4,u5);
		
//		stream.filter(k -> k.age>15 && k.name.startsWith("M")).forEach(System.out::println);
//       //User [name=Maru, age=50]
		
		stream.filter(k->k.sal>10000).map(k->k.name+" "+k.age).forEach(System.out::println);//Malli 10
//		Varun 15
	}

}
