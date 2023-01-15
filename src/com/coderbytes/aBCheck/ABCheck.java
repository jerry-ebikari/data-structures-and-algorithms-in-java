package com.coderbytes.aBCheck;

public class ABCheck {
    public static String aBCheck(String str) {
        return str.split("a.{3}b").length > 1 ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(aBCheck("after badly"));
        System.out.println(aBCheck("Laura sobs"));
    }
}
