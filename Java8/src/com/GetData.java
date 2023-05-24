package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetData {
	
	public static void main(String[] args) {
		List<Employee> l=Arrays.asList( new Employee(1,"Akshay","Pune",40000),
				new Employee(1,"Akshay","Pune",47000),new Employee(5,"Saurabh","Mumbai",42000),
				new Employee(3,"Ravindra","Pune",20000),new Employee(2,"Akash","Chennai",50000)
				);
		
		l.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(
				l.stream()
				.sorted(Comparator.comparing(Employee::getSalary)
				.reversed()).skip(2).findFirst().get());
		System.out.println("*********************************************");
		
		l.stream().collect(Collectors.groupingBy(Employee::getAddress))
		.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.forEach(System.out::println);
	}

}
