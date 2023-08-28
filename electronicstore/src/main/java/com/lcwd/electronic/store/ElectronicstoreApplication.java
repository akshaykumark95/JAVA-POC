package com.lcwd.electronic.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ElectronicstoreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ElectronicstoreApplication.class, args);
	}

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(passwordEncoder.encode("akshay@123"));
		System.out.println(passwordEncoder.encode("akas@12"));
		System.out.println(passwordEncoder.encode("akash@123"));
	}


}
