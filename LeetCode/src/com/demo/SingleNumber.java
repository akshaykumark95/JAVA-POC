package com.demo;

public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // Using XOR to find the single number
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 3, 3};
        int singleNumber = findSingleNumber(nums);
        System.out.println("The single number is: " + singleNumber);
    }
}


