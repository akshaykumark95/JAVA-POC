package com.exception;

public class ClassCheck {
	
	public static void main(String[] args) {
		try {
		Class.forName("com.exception.Demo.class");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class Not Found With Given Name !!");
		}
	}

}
