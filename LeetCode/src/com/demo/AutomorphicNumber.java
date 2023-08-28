package com.demo;

import java.util.Scanner;

public class AutomorphicNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n*n, n1=n, temp=1;
		while(n1>0)
		{
			n1=n1/10;
			temp=temp*10;
		}
		
		m=m%temp;
		
		if(n==m)
		{
			System.out.println(n+" is Automorphic number");
		} else {
			System.out.println(n+ " is not automorphic number");
		}
	}

}
