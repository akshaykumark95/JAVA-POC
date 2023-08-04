package com.clone.deep;

class Address {
	String city;
	
	public Address(String city) {
		this.city= city;
	}
	
	public String getCity() {
		return city;
	}
	
	// Perform a deep copy of the Address object.
    @Override
    public Address clone() {
        return new Address(city);
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
	
	// Perform a deep copy of the Person object.
    @Override
    public Employee clone() {
        return new Employee(name, age, address.clone());
    }

}

