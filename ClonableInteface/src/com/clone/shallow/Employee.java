package com.clone.shallow;

class Address {
	String city;
	
	public Address(String city) {
		this.city= city;
	}
	
	public String getCity() {
		return city;
	}
}

public class Employee implements Cloneable{
	private String name;
	private int age;
	private Address address;
	
	public Employee(String name, int age, Address address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Address getAddress() {
		return address;
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}

}
