package com.demo;

import java.util.Scanner;

public class NeonNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n*n, sum=0;
		
		while(m>0)
		{
			sum=sum+m%10;
			m=m/10;
		}
		
		if(sum==n)
		{
			System.out.println(n+" is neon number");
		} else {
			System.out.println(n+" is not neon number");
		}
	}

}
