package com.coderbytes.vowelCount;

public class VowelCount {
    public static int vowelCount(String str) {
        String vowels = "aeiouAEIOU";
        String regexString = "[" + vowels + "]";
        return str.length() - str.replaceAll(regexString, "").length();
    }

    public static void main(String[] args) {
        System.out.println(vowelCount("coderbyte"));
        System.out.println(vowelCount("hello"));
    }
}
