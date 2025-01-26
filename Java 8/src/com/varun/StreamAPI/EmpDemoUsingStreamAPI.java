package com.varun.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EmpDemoUsingStreamAPI {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("varun",23,50000));
		list.add(new Emp("Kiran",25,45000));
		list.add(new Emp("Arun",24,9500));
		
		list.stream().filter(n -> n.getSalary() > 10000).map(k->k.getEmpName() + "-" + k.getEmpAge()).forEach(System.out::println);
		list.stream().filter(n -> n.getSalary() > 10000).forEach(k -> System.out.println(k.getEmpName() + " " + k.getEmpAge()));
	}

}
