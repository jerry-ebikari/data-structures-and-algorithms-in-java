package com.coderbytes.alphabetSoup;

import java.util.Arrays;

public class AlphabetSoup {
    public static String alphabetSoup(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.println(alphabetSoup("coderbyte"));
        System.out.println(alphabetSoup("hooplah"));
    }
}
