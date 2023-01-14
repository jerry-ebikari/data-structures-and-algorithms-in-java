package com.coderbytes.simpleSymbols;

public class SimpleSymbols {
    public static String simpleSymbols(String str) {
        String letterAtStart = "^[a-zA-Z]";
        String letterAtEnd = "[a-zA-Z]$";
        String letterNotSurroundedByPlus = "[^+][a-zA-Z][^+]";
        String regexString = letterAtStart + "|" + letterAtEnd + "|" + letterNotSurroundedByPlus;
        return str.split(regexString).length > 1 ? "false" : "true";
    }

    public static void main(String[] args) {
        System.out.println(simpleSymbols("+d+=3=+s+"));
        System.out.println(simpleSymbols("f++d+"));
    }
}
