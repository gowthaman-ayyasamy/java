package com.test;

public class ReverseWords {

    public static String reverseWords(String str) {
     
        String[] words = str.trim().split("\\s+");

        // Reverse using two pointers
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Join words back into string
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String input = "All is well";
        String result = reverseWords(input);
        System.out.println(result);
    }
}