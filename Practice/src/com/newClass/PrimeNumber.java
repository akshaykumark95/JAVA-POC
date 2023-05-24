package com.newClass;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int count = 0;
		int alt = 1;
		for (int i = 1; i <= 50; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				alt++;
				if (alt % 2 == 0) {
					System.out.print(i + " ");

				}
			}
	}

	}}
