package com.neo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fileStream=new FileInputStream("C:\\Users\\Neosoft\\Desktop\\New folder/file.txt");
		
		ObjectInputStream objectStream=new ObjectInputStream(fileStream);
		
		Employee readObject =(Employee) objectStream.readObject();
	
		System.out.println(readObject.getName());
		System.out.println(readObject.getCity());
		
	}
}
