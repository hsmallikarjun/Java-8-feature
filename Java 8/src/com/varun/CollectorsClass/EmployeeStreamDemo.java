package com.varun.CollectorsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeStreamDemo {

	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee(10,"Karthik",34,"male","Developer",2012,30000.0));
		emplist.add(new Employee(11,"Divya",28,"female","HR",2015,25000.0));
		emplist.add(new Employee(12,"Vivek",30,"male","Sales and Marketing",2015,14000.0));
		emplist.add(new Employee(13,"Kiran",32,"male","Product Development",2014,32000.0));
		emplist.add(new Employee(14,"Arun",36,"male","Developer",2016,30000.0));
		emplist.add(new Employee(21,"Punith",31,"male","HR",2015,25000.0));
		emplist.add(new Employee(16,"Yamuna",50,"female","Sales and Marketing",2015,14500.0));
		emplist.add(new Employee(17,"Putta",34,"male","Product Development",2014,33000.0));
		
		
		// Q1: How many males and females employees in the list?
		Map<String,Long> temp = emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(temp);
		
		System.out.println();
		
		// Q2. Print the name of the department
		emplist.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		//or
		System.out.println();

		Map<String,Long> dept = emplist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(dept.keySet());
		
		System.out.println();

		// Q3. Avg age of male and female emp
		
		Map<String,Double> avg = emplist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avg);
		
		System.out.println();

		// Q4. Highest paid empolyee in org
		
		Optional<Employee> hp = emplist.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(hp.get().getName());
		
		System.out.println();

		
		// Q5. Get the emp who joined after 2015
		
		Stream<Employee> e = emplist.stream().filter(k -> k.getYearOfJoining() > 2014);
		e.forEach(k -> System.out.println(k.getName()));
		
		System.out.println();
		
	}

}
