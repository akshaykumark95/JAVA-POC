package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<>();
		m.put(8, "Sagar");
		m.put(3, "Megha");
		m.put(6, "Ravi");
		m.put(9, "Jadhav");
		m.put(5, "Patil");
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		m.entrySet().stream().filter(t->t.getKey()%2!=0).forEach(System.out::println);
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	    
		List<String> list=new ArrayList<>();
		list.add("Priya");
		list.add("Kiran");
		list.add("Pallu");
		list.add("Shradha");
		list.add("Kalyani");
		list.add("Rahu");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		System.out.println("**********************************************");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("**********************************************");
		list.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
		System.out.println("**********************************************");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("**************___*******************************");
		
	}

}
