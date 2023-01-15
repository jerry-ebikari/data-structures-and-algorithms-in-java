package com.coderbytes.palindrome;

public class Palindrome {
    public static String palindrome(String str) {
        String str1 = str.replaceAll(" ", "");
        return str1.equals(new StringBuilder(str1).reverse().toString()) ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(palindrome("never odd or even"));
        System.out.println(palindrome("eye"));
    }
}
