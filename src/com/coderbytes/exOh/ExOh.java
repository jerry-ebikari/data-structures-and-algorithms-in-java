package com.coderbytes.exOh;

public class ExOh {
    public static String exOh(String str) {
        int strLength = str.length();
        int numberOfXes = strLength - str.replaceAll("[xX]", "").length();
        int numberOfOs = strLength - str.replaceAll("[oO]", "").length();
        return numberOfOs == numberOfXes ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(exOh("xooxxo"));
        System.out.println(exOh("x"));
    }
}
