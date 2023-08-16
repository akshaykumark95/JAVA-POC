package com.demo;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // Iterate through the array, move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        
        moveZeroes(nums);
        
        System.out.println("Array after moving zeroes: " + java.util.Arrays.toString(nums));
    }
}

