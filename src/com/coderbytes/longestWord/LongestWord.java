package com.coderbytes.longestWord;

public class LongestWord {
    public static String longestWord(String sen) {
        String[] wordsWithPunctuation = sen.split(" ");
        // remove punctuation
        sen = sen.replaceAll("[^a-z^ ]", "");
        String[] wordsWithoutPunctuation = sen.split(" ");
        int longestIndex = 0;
        int longest = wordsWithoutPunctuation[0].length();
        for (int i = 1; i < wordsWithoutPunctuation.length; i++) {
            if (wordsWithoutPunctuation[i].length() > longest) {
                longest = wordsWithoutPunctuation[i].length();
                longestIndex = i;
            }
        }
        return wordsWithPunctuation[longestIndex];
    }

    public static void main(String[] args) {
        System.out.println(longestWord("fun&!! time"));
        System.out.println(longestWord("I love dogs"));
    }
}
