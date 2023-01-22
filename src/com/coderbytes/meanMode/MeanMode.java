package com.coderbytes.meanMode;

import java.util.HashMap;
import java.util.Map;

public class MeanMode {
    public static double getMean(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return 1.0 * sum / length;
    }

    public static int getMode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } 
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        int mostOccuring = 0;
        for (int i: map.keySet()) {
            if (map.get(i) > mostOccuring) {
                mostOccuring = i;
            }
        }
        return mostOccuring;
    }

    public static int meanMode(int[] arr) {
        return (double)getMode(arr) == getMean(arr) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 4, 4, 6, 2};
        System.out.println(meanMode(arr1));
        System.out.println(meanMode(arr2));
    }
}
