package com.coderbytes.powerSetCount;

public class PowerSetCount {
    public static int powerSetCount(int[] arr) {
        int length = arr.length;
        int count = 0;
        for (int i = length; i >= 0; i--) {
            count += combination(length, i);
        }
        return count;
    }

    public static long factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int[] arr3 = {1, 2, 3};
        System.out.println(powerSetCount(arr1));
        System.out.println(powerSetCount(arr2));
        System.out.println(powerSetCount(arr3));
    }
}
