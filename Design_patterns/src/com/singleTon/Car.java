package com.singleTon;

public class Car {
	
	private static Car car;
	
	private Car()
	{
		
	}
	
	public static Car getCar() {
		
		if(car==null) {
			
			synchronized (Car.class) {
				if(car==null)
				 car=new Car();
			}
			
			//return car;
		}
		return car;
		
	}
}
