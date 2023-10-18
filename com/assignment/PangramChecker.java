package com.assignment;

public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('a' <= c && c <= 'z') {
                alphabets[c - 'a'] = true;
            }
        }

        for (boolean alphabet : alphabets) {
            if (!alphabet) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "My Name is Himanshu and I am wirthing this program for checking if the string is panagarm or not";
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

