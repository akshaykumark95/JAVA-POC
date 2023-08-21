package com.demo;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0, mult=1;
		while(n>0)
		{
			sum=sum+n%10;
			mult=mult*n%10;
			n=n/10;
			
		}
		if(sum==mult)
		{
			System.out.println(n+" is spy number");
		}else {
			System.out.println(n+" is not spy number");
		}
	}

}
