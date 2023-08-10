package com.demo;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isVowel(chars[left]) && isVowel(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            } else if (isVowel(chars[left])) {
                right--;
            } else {
                left++;
            }
        }

        return new String(chars);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String input = "leetcode";
        String reversed = reverseVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String with Reversed Vowels: " + reversed);
    }
}
