package com.logical;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndexMap.containsKey(complement)) {
                System.out.println("Pair found at indices: " + numIndexMap.get(complement) + " and " + i);
            }
            numIndexMap.put(nums[i], i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 5, 8};
        int target = 10;
        
        System.out.println("Pairs with sum " + target + ":");
        findTwoSum(nums, target);
    }
}
