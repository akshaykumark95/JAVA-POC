package com.exception;

public class Demo {
	//public static void main(String[] args) {
	 int age;
	 public static void voting(int age) throws AgeInvalidException {
		if(age>=18) {
			System.out.println("Candidate elligible for voting");
		}
		else {
			throw new AgeInvalidException("Candidate is not elligible for voting");
		}
	 }
	 public static void main(String[] args) throws AgeInvalidException {
		Demo.voting(18);
	}
	}


