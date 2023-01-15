package com.coderbytes.exOh;

public class ExOh {
    public static String exOh(String str) {
        int strLength = str.length();
        if (strLength < 2 || strLength % 2 == 1) return "false";
        int numberOfXes = strLength - str.replaceAll("[xX]", "").length();
        int numberOfOs = strLength - str.replaceAll("[oO]", "").length();
        return numberOfOs == numberOfXes ? "true" : "false";
    }

    public static String exOh2(String str) {
        int strLength = str.length();
        if (strLength < 2 || strLength % 2 == 1) return "false";
        int numberOfOs = 0;
        for (int i = 0; i < strLength; i++) {
            if ("oO".contains((str.charAt(i) + ""))) {
                numberOfOs++;
            }
        }
        return strLength - numberOfOs == numberOfOs ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(exOh("xooxxo"));
        System.out.println(exOh("x"));
    }
}
