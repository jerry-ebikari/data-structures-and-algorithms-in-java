package com.coderbytes.superIncreasing;

public class SuperIncreasing {
    public static String superIncreasing(int[] arr) {
        int length = arr.length;
        if (length == 0) return "true";
        int sum = arr[0];
        for (int i = 1; i < length; i++) {
            if (arr[i] <= sum) return "false";
            sum += arr[i];
        }
        return "true";
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,5,10};
        int[] arr3 = {1, 3, 6, 13, 54};
        System.out.println(superIncreasing(arr1));
        System.out.println(superIncreasing(arr2));
        System.out.println(superIncreasing(arr3));
    }
}
