package com.coderbytes.hammingDistance;

public class HammingDistance {
    public static int hammingDistance(String[] arr) {
        int length = arr[0].length();
        int distance = 0;
        for (int i = 0; i < length; i++) {
            distance += arr[0].charAt(i) != arr[1].charAt(i) ? 1 : 0;
        }
        return distance;
    }

    public static void main(String[] args) {
        String[] arr1 = {"10011", "10100"};
        String[] arr2 = {"helloworld", "worldhello"};
        String[] arr3 = {"coder", "codec"};
        System.out.println(hammingDistance(arr1));
        System.out.println(hammingDistance(arr2));
        System.out.println(hammingDistance(arr3));
    }
}
