package com.exception;

import java.util.Arrays;
import java.util.List;

public class UncheckedException {

	public static void main(String[] args) {
		try {

			//Arithematic Exception
			int a = 0;
			int b = 1;
			int c = b / a;
			
			//StringIndexOutOfBounds Exception
			String s = "abcd";
			s.charAt(5);
			
			//ClassCast Exception
			Object obj = new String("Hello");
	        System.out.println((Integer) obj);

			//UnsupportedOperation Exception
			String array[] = {"a", "b", "c"};
	        List<String> list = Arrays.asList(array);
	        list.add("d");

		} catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(ClassCastException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(UnsupportedOperationException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
