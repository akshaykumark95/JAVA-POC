package com.logical;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nrev=0,n1=n;
		while(n>0) {
			nrev=nrev*10+(n%10);
			n=n/10;
		}
		if(n1==nrev) {
			System.out.println(n1+" is Palindrome number");
		}else {
			System.out.println(n1+ " is not Palindrome");
		}
	}

}

