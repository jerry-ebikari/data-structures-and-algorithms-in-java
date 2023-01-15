package com.coderbytes.exOh;

public class ExOh {
    public static String exOh(String str) {
        if (str.length() < 2) return "false";
        int strLength = str.length();
        int numberOfXes = strLength - str.replaceAll("[xX]", "").length();
        int numberOfOs = strLength - str.replaceAll("[oO]", "").length();
        return numberOfOs == numberOfXes ? "true" : "false";
    }

    public static String exOh2(String str) {
        if (str.length() < 2) return "false";
        int numberOfOs = 0;
        int strLength = str.length();
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
