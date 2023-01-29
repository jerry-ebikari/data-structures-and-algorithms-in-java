package com.coderbytes.longestIncreasingSequence;

public class LongestIncreasingSequence {
    public static int longestIncreasingSequence(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            int currentLargest = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (currentLargest < arr[j]) {
                    currentLargest = arr[j];
                    count++;
                }
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 9, 4, 2};
        int[] arr2 = {10, 22, 9, 33, 21, 50, 41, 60, 22, 68, 90};
        int[] arr3 = {4, 3, 5, 1, 6};
        System.out.println(longestIncreasingSequence(arr1));
        System.out.println(longestIncreasingSequence(arr2));
        System.out.println(longestIncreasingSequence(arr3));
    }
}
