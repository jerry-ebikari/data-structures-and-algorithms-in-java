package com.coderbytes.palindrome;

public class Palindrome {
    public static String palindrome(String str) {
        String str1 = str.replaceAll(" ", "");
        return str1.equals(new StringBuilder(str1).reverse().toString()) ? "true" : "false";
    }

    public static String iterativePalindrome(String str) {
        String str1 = str.replaceAll(" ", "");
        int strLength = str1.length();
        int j = strLength - 1;
        for (int i = 0; i < strLength; i++) {
            if (str1.charAt(i) != str1.charAt(j)) {
                return "false";
            }
            j--;
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("never odd or even"));
        System.out.println(palindrome("eye"));
    }
}
