package AbstractDesignPattern;

public class Client {
	public static void main(String[] args) {
		Employee e1=EmployeeFactory.getEmployee(new AndroidDevFactory());
		
		System.out.println(e1.name());
	}

}
