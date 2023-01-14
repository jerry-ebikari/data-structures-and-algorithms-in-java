package com.algorithms.replaceEveryNthCharacter;

public class ReplaceEveryNthCharacter {
    public static String replaceEveryNthCharacter(String str, String replacement, int n) {
        if (n < 1) return str;
        // (.{2}). - every third character when n = 3
        String regexString = "(.{" + (n - 1) + "}).";
        return str.replaceAll(regexString, "$1" + replacement);
    }

    public static void main(String[] args) {
        System.out.println(
            replaceEveryNthCharacter(
                "abcdefghijklmnopqrstuvwxyz",
                "-",
                3
            )
        );
    }
}
