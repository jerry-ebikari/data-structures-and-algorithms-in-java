package com.crackingTheInterview.uRLify;

public class URLify {
    public static String uRLify(String str, int trueLength) {
        return uRLify(str);
    }

    public static String uRLify(String str) {
        str = str.trim();
        return str.replace(" ", "%20");
    }

    public static void main(String[] args) {
        System.out.println(uRLify("Mr John Smith "));
    }
}
