package com.coderbytes.twoSum;

public class TwoSum {
    public static String twoSum(int[] arr) {
        int target = arr[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sb.append(arr[i] + "," + arr[j] + " ");
                }
            }
        }
        if (sb.length() == 0) return "-1";
        return new String(sb).trim();
    }

    public static void main(String[] args) {
        int[] arr1 = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
        int[] arr2 = {7, 6, 4, 1, 7, -2, 3, 12};
        int[] arr3 = {7, 3, 5, 2, -4, 8, 11};
        System.out.println(twoSum(arr1));
        System.out.println(twoSum(arr2));
        System.out.println(twoSum(arr3));
    }
}
