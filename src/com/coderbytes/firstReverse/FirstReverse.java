package com.coderbytes.firstReverse;

public class FirstReverse {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("coderbyte"));
        System.out.println(reverse("I Love Code"));
    }
}
