package com.algorithms.sum1ToN;

public class Sum1ToN {
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(sum(5));
        System.out.println(sum(10));
    }
}
