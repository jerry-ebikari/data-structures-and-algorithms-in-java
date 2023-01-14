package com.algorithms.numberOfOccurrences;

import java.util.regex.Pattern;

public class NumberOfOccurrences {
    public static int findNumberOfOccurrence(String str, String subString) {
        return str.split(Pattern.quote(subString)).length - 1;
    }

    public static void main(String[] args) {
        System.out.println(findNumberOfOccurrence(
            "Fear leads to anger; anger leads to hatred; hatred leads to conflict",
            "lead"
        ));
    }
}
