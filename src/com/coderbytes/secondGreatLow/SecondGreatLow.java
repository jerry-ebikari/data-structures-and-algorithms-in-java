package com.coderbytes.secondGreatLow;
import java.util.Arrays;

public class SecondGreatLow {
    public static String secondGreatLow(int[] arr) {
        Arrays.sort(arr);
        int arrLength = arr.length;
        return arr[1] + " " + arr[arrLength - 2];
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 42, 42, 180};
        int[] arr2 = {4, 90};
        System.out.println(secondGreatLow(arr1));
        System.out.println(secondGreatLow(arr2));
    }
}
