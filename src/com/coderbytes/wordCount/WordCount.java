package com.coderbytes.wordCount;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordCount {
    public static int wordCount(String str) {
        str = str.trim().replaceAll("\\s{2,}", " ");
        if (str.length() < 1) return 0;
        return str.length() - str.replaceAll(" ", "").length() + 1;
    }

    public static int wordCount2(String str) {
        str = str.trim().replaceAll("\\s{2,}", " ");
        if (str.length() < 1) return 0;
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(str);
        int numberOfWords = 1;
        while (matcher.find()) {
            numberOfWords++;
        }
        return numberOfWords;
    }

    public static void main(String[] args) {
        System.out.println(wordCount2("Hello World"));
        System.out.println(wordCount2("one 22 three"));
    }
}
