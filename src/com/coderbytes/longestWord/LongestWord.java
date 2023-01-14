package com.coderbytes.longestWord;

public class LongestWord {
    public static String longestWord(String sen) {
        String[] arr = sen.split(" ");
        sen = sen.replaceAll("[^a-z^ ]", "");
        String[] arr1 = sen.split(" ");
        int longestIndex = 0;
        int longest = arr1[0].length();
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i].length() > longest) {
                longest = arr[i].length();
                longestIndex = i;
            }
        }
        return arr[longestIndex];
    }

    public static void main(String[] args) {
        System.out.println(longestWord("fun&!! time"));
        System.out.println(longestWord("I love dogs"));
    }
}
