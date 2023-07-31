package com.logical;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	 public static void main(String[] args) {
	        int[] nums = {0, 1, 2, 4, 5, 7};
	        List<String> output = findRanges(nums);
	        System.out.println(output);
	    }

	    public static List<String> findRanges(int[] nums) {
	        List<String> result = new ArrayList<>();

	        for (int i = 0; i < nums.length; i++) {
	            int start = nums[i];

	            // Check if there is a consecutive sequence of numbers
	            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
	                i++;
	            }

	            int end = nums[i];

	            // Format the range and add it to the result list
	            result.add(start == end ? Integer.toString(start) : start + "->" + end);
	        }

	        return result;
	    }

}
