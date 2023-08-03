package com.neo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private String name;
    transient private String city;
	
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
