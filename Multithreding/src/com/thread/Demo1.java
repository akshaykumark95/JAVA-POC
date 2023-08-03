package com.thread;

public class Demo1 {
	
	public static void main(String[] args) {
		
		RunnableDemo runnableDemo = new RunnableDemo();
		Thread t = new Thread(runnableDemo);
		t.start();
	}

}
