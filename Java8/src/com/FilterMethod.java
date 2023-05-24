package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethod {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
	list.add("akshay");
	list.add("rahul");
	list.add("saurabh");
	list.add("akash");
	list.add("ashish");
	list.add("siddhu");
	
	/*
	for(String s:list) {
		if(s.startsWith("a")) {
			System.out.println(s);
		}
	}
	*/
	
	list.stream().filter(t->t.startsWith("s")).forEach(t->System.out.println(t));
	System.out.println("**********************************************");
	list.stream().sorted().forEach(t->System.out.println(t));
	System.out.println("**********************************************");
	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println("**********************************************");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("**************___*******************************");
	
	Map<Integer, String> m=new HashMap<>();
	m.put(1, "rahul");
	m.put(7, "saurabh");
	m.put(2, "ashish");
	m.put(4, "siddhu");
	m.put(5, "akshay");
	
	m.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
	
	m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	System.out.println("---------------------------------------");
	m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
}
}
