package Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
public static void main(String[] args) {
	List<EMployee> emplist=new ArrayList<>();
	emplist.add(new EMployee(10,"karthik",34,"male","Devloper",2012,30000.0));
	emplist.add(new EMployee(11,"divya",29,"Female","HR",2015,25000.0));
	emplist.add(new EMployee(12,"vivek",30,"male","sales and marketting",2015,14000.0));
	emplist.add(new EMployee(13,"kiran",32,"male","Product Devlopment",2014,32000.0));
	emplist.add(new EMployee(14,"arun",36,"male","Devloper",2016,30000.0));
	emplist.add(new EMployee(15,"punith",31,"male","HR",2015,25000.0));
	emplist.add(new EMployee(21,"punith12",29,"male","HR",2015,25001.0));
	emplist.add(new EMployee(16,"yamuna",50,"Female","sales and marketting",2015,14500.0));
	emplist.add(new EMployee(17,"putta",34,"male","Product Devlopment",2014,33000.0));

//how many males and female emp?
	Map<String,Long> temp=emplist.stream().collect(Collectors.groupingBy(EMployee::getGender,Collectors.counting()));
	System.out.println(temp);
	//{Female=2, male=7}
	
	//Print the name of the department?
emplist.stream().map(EMployee::getDepartment).distinct().forEach(System.out::println);
//output
	//Devloper
	//HR
	//sales and marketting
	//Product Devlopment

//or

Map<String,Long> temp1=emplist.stream().collect(Collectors.groupingBy(EMployee::getDepartment,Collectors.counting()));
System.out.println(temp1.keySet());
//[Devloper, Product Devlopment, sales and marketting, HR]


//Avg age of male and female emp?
Map<String,Double> avg=emplist.stream().collect(Collectors.groupingBy(EMployee::getGender,Collectors.averagingInt(EMployee::getAge)));
System.out.println(avg);
//{Female=39.5, male=32.285714285714285}

//Highest paid Employee in org?

Optional<EMployee> hp=emplist.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EMployee::getSalary)));
System.out.println(hp.get().getName());
//putta

//Get the Employye who joined after 2015?
emplist.stream().filter(e -> e.getYearofjoining() > 2015).map(EMployee::getName)
.forEach(System.out::println);
//arun


	
}
}
