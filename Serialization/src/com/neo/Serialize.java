package com.neo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	
	public static void main(String[] args) throws IOException {
		
		Employee student = new Employee("Akshaykumar","pune");
		
	
		FileOutputStream file=new FileOutputStream("C:\\Users\\Neosoft\\Desktop\\New folder/file.txt");
		
		ObjectOutputStream obj=new ObjectOutputStream(file);
		
		obj.writeObject(student);
		
		obj.close();
		file.close();
		
		System.out.println("serialization is done");
	}
}
