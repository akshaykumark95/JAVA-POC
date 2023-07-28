package FactoryDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("geting web deveoper salary");
		return 50000;
	}

}
