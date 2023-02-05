package com.algorithms.combinations;

public class Combinations {
    public static char[][] combinations(int[] arr) {
        int max = (int) Math.pow(2, arr.length);
        int arrLength = arr.length;
        char[][] result = new char[max][];
        for (int i = 0; i < max; i++) {
            String element = "";
            String binaryString = integerToBinary(i, arrLength);
            for (int j = 0; j < arrLength; j++) {
                if (binaryString.charAt(j) == '1') {
                    element += arr[j] + "";
                }
            }
            result[i] = element.toCharArray();
        }
        return result;
    }

    public static String integerToBinary(int n, int binaryStringLength) {
        String binaryString = Integer.toString(n, 2);
        int padding = binaryStringLength - binaryString.length();
        return "0".repeat(padding) + binaryString;
    }

    public static void printArr(char[] chars) {
        for (char c: chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        char[][] combos = combinations(arr1);
        for (char[] combo: combos) {
            printArr(combo);
        }
    }
}
