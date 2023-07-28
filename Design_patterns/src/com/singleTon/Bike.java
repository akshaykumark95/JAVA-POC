package com.singleTon;

public class Bike {

	private static Bike bike=new Bike();
	//eager way of creating singleton object
	public static Bike getBike() {
		return bike;
	}
}
