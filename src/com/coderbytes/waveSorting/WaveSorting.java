package com.coderbytes.waveSorting;

import java.util.HashMap;
import java.util.Map;

public class WaveSorting {
    public static String waveSorting(int[] arr) {
        Map<Integer, Integer> arrMap = arrToMap(arr);
        int maxFrequency = getMaxFrequency(arrMap);
        return maxFrequency <= Math.floor(arr.length / 2) ? "true" : "false";
    }

    public static Map<Integer, Integer> arrToMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (map.get(i) != null) {
                map.put(i, map.get(i) + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        return map;
    }

    public static int getMaxFrequency(Map<Integer, Integer> map) {
        int max = 0;
        for (int i: map.values()) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 4, 1, 1, 1};
        int[] arr2 = {0, 4, 22, 4, 14, 4, 2};
        int[] arr3 = {2, 0, 4, 1, 4, 1};
        System.out.println(waveSorting(arr1));
        System.out.println(waveSorting(arr2));
        System.out.println(waveSorting(arr3));
    }
}
