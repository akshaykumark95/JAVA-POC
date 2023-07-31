package com.logical;

public class Demo {
	public static void main(String[] args) {
        final int numThreads = 5;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new RandomOutputThread();
            threads[i].start();
        }
    }

    static class RandomOutputThread extends Thread {
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        private static final int OUTPUT_LENGTH = 10;

        @Override
        public void run() {
            for (int i = 0; i < OUTPUT_LENGTH; i++) {
                char randomChar = getRandomCharacter();
                System.out.print(randomChar);
            }
            System.out.println();
        }

        private char getRandomCharacter() {
            int randomIndex = (int) (Math.random() * CHARACTERS.length());
            return CHARACTERS.charAt(randomIndex);
        }
    }


}
