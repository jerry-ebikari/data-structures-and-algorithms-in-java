package com.coderbytes.overlappingRanges;

public class OverlappingRanges {
    public static String overlappingRanges(int[] arr) {
        int greaterMinimum = Math.max(arr[0], arr[2]);
        int smallerMaximum = Math.min(arr[1], arr[3]);
        return smallerMaximum - greaterMinimum + 1 < arr[4] ? "false" : "true";
    }

    public static String overlappingRanges2(int[] arr) {
        int i = arr[0] > arr[2] ? arr[0] : arr[2];
        int overlap = 0;
        while (i <= arr[1] && i <= arr[3]) {
            overlap++;
            i++;
        }
        return overlap < arr[4] ? "false" : "true";
    }

    public static void main(String[] args) {
        int[] arr1 = {5,11,1,5,1};
        int[] arr2 = {1,8,2,4,4};
        int[] arr3 = {4, 10, 2, 6, 3};
        System.out.println(overlappingRanges(arr1));
        System.out.println(overlappingRanges(arr2));
        System.out.println(overlappingRanges(arr3));
    }
}
