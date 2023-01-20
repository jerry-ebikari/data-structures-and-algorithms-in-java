package com.coderbytes.medium.bracketMatcher;

public class BracketMatcher {
    public static String bracketMatcher(String str) {
        int stringLength = str.length();
        int numberOfOpeningBrackets = 0;
        int numberOfClosingBrackets = 0;
        for (int i = 0; i < stringLength; i++) {
            if (str.charAt(i) == '(') {
                numberOfOpeningBrackets++;
            }
            else if (str.charAt(i) == ')') {
                numberOfClosingBrackets++;
            }
            if (numberOfClosingBrackets > numberOfOpeningBrackets) {
                return "0";
            }
        }
        return numberOfOpeningBrackets == numberOfClosingBrackets ? "1" : "0";
    }

    public static void main(String[] args) {
        System.out.println(bracketMatcher("(hello (world))"));
        System.out.println(bracketMatcher("((hello (world))"));
    }
}
