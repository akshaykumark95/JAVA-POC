package com.demo;

import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int lastWordLength = findLastWordLength(sentence);
        
        System.out.println("Length of the last word: " + lastWordLength);
        
        scanner.close();
    }
    
    public static int findLastWordLength(String sentence) {
        // Remove trailing spaces from the sentence
        sentence = sentence.trim();
        
        // Split the sentence into words using spaces
        String[] words = sentence.split(" ");
        
        // Check if there are any words
        if (words.length > 0) {
            // Get the last word from the array
            String lastWord = words[words.length - 1];
           
            return lastWord.length();
        } else {
            return 0;
        }
    }
}

