package com.clone.shallow;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Address address=new Address("Pune");
		Employee originalEmployee = new Employee("Akshay", 28, address);
		Employee clonedEmployee = originalEmployee.clone();
		
		System.out.println("Original: " + originalEmployee.getName() + ", " + originalEmployee.getAddress().getCity());
	    System.out.println("Cloned: " + clonedEmployee.getName() + ", " + clonedEmployee.getAddress().getCity());
	  
	    clonedEmployee.getAddress().city="Mumbai";
	    System.out.println("After modification - Original: " + originalEmployee.getName() + ", " + originalEmployee.getAddress().getCity());
	    System.out.println("After modification - Cloned: " + clonedEmployee.getName() + ", " + clonedEmployee.getAddress().getCity());
	  

	}

}
