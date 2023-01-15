package com.coderbytes.wordCount;

public class WordCount {
    public static int wordCount(String str) {
        str = str.trim().replaceAll("\\s{2,}", " ");
        return str.length() - str.replaceAll(" ", "").length() + 1;
    }

    public static void main(String[] args) {
        System.out.println(wordCount("Hello World"));
        System.out.println(wordCount("one 22 three"));
    }
}
