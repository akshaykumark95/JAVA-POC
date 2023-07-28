package FactoryDesignPattern;

public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("geting adroid developer salary");
		return 40000;
	}

}
