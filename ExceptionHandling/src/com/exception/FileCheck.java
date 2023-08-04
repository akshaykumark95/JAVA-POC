package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileCheck {
public static void main(String[] args) {
		
		try {
			FileInputStream fileInputStream = new FileInputStream
					("C:\\Users\\Neosoft\\Desktop\\New folder/sql.txt");
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist");
		}
		
		
	}

}
