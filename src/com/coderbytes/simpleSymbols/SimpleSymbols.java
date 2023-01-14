package com.coderbytes.simpleSymbols;

public class SimpleSymbols {
    public static String simpleSymbols(String str) {
        String letterAtStart = "^[a-zA-Z]";
        String letterAtEnd = "[a-zA-Z]$";
        String letterNotSurroundedByPlus = "[^+][a-zA-Z][^+]";
        String regexString = letterAtStart + "|" + letterAtEnd + "|" + letterNotSurroundedByPlus;
        return str.split(regexString).length > 1 ? "false" : "true";
    }

    public static String iterativeSimpleSymbols(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        // return false if either the first or the last character is a letter
        if (Character.isLetter(charArray[0]) || Character.isLetter(charArray[length - 1])) {
            return "false";
        }
        for (int i = 1; i < length - 1; i++) {
            if (Character.isLetter(charArray[i])) {
                if (charArray[i - 1] == '+' && charArray[i + 1] == '+') {
                    i++;
                    continue;
                }
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(simpleSymbols("+d+=3=+s+"));
        System.out.println(simpleSymbols("f++d+"));
    }
}
