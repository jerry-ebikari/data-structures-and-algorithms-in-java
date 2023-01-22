package com.coderbytes.dashInsert;

public class DashInsert {
    public static String dashInsert(String str) {
        String regexString = "([13579])(?=[13579])";
        return str.replaceAll(regexString, "$1-");
    }
    
    public static void main(String[] args) {
        System.out.println(dashInsert("99946"));
        System.out.println(dashInsert("56730"));
    }
}
