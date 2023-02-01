package com.coderbytes.powerSetCount;

public class PowerSetCount {
    public static int powerSetCount(int[] arr) {
        return (int) Math.pow(2, arr.length);
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
