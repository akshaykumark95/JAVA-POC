package com.singleTon;

public class Test {
	public static void main(String[] args) {
		Car car=Car.getCar();
		System.out.println(car.hashCode());
		
		Car ca1r=Car.getCar();
		System.out.println(ca1r.hashCode());
	}

}
