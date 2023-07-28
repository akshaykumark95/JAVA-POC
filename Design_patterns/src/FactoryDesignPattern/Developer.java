package FactoryDesignPattern;

public class Developer {
public static void main(String[] args) {
	Employee emp= DeveloperFactory.getEmployee("Web Developer");
	//emp.salary();
	int salary=emp.salary();
	System.out.println("salary:"+salary);
}
}
