package com.coderbytes.arrayMatching;

public class ArrayMatching {
    public static String arrayMatching(int[][] arr) {
        int maxLength = getMaxArrLength(arr);
        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            for (int[] arr1: arr) {
                if (arr1.length > i) {
                    result[i] += arr1[i];
                }
            }
        }
        return encode(result);
    }

    public static int getMaxArrLength(int[][] arr) {
        int maxLength = 0;
        for (int[] arr1: arr) {
            if (arr1.length > maxLength) {
                maxLength = arr1.length;
            }
        }
        return maxLength;
    }

    public static String encode(int[] arr) {
        int length = arr.length;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
            if (i < length - 1) {
                sb.append("-");
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        int[][] arr1 = {
            {5, 2, 3},
            {2, 2, 3, 10, 6}
        };
        int[][] arr2 = {
            {1, 2, 1},
            {2, 1, 5, 2}
        };
        System.out.println(arrayMatching(arr1));
        System.out.println(arrayMatching(arr2));
    }
}
