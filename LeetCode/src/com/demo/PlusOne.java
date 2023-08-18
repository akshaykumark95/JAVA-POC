package com.demo;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0; // Set the digit to 0 and continue
        }
        
        // If all digits were 9, create a new array with a leading 1
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        
        System.out.println("Original number: " + Arrays.toString(digits));
        System.out.println("Number plus one: " + Arrays.toString(result));
    }
}

