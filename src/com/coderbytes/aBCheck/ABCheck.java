package com.coderbytes.aBCheck;

public class ABCheck {
    public static String aBCheck(String str) {
        return str.split("[aA].{3}[bB]|[bB].{3}[aA]").length > 1 ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(aBCheck("after badly"));
        System.out.println(aBCheck("Laura sobs"));
    }
}
