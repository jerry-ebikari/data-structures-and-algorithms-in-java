package com.coderbytes.arrayMatching;

import java.util.ArrayList;
import java.util.List;

public class ArrayMatching {
    public static String arrayMatching(String[] arr) {
        List<Integer> result = new ArrayList<>();
        for (String str: arr) {
            str = str.replaceAll("[^\\d]+", " ").trim();
            String[] numbers = str.split(" ");
            for (int i = 0; i < numbers.length; i++) {
                if (result.size() <= i) {
                    result.add(0);
                }
                if (result.get(i) != null) {
                    result.set(i, result.get(i) + Integer.parseInt(numbers[i]));
                }
                else {
                    result.set(i, Integer.parseInt(numbers[i]));
                }
            }
        }
        return encode(result);
    }

    public static String encode(List<Integer> arr) {
        int length = arr.size();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(arr.get(i));
            if (i < length - 1) {
                sb.append("-");
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        String[] arr1 = {"[5, 2, 3]", "[2, 2, 3, 10, 6]"};
        String[] arr2 = {"[1, 2, 1]", "[2, 1, 5, 2]"};
        String[] arr3 = {"[1, 2, 5, 6]", "[5, 2, 8, 11]"};
        System.out.println(arrayMatching(arr1));
        System.out.println(arrayMatching(arr2));
        System.out.println(arrayMatching(arr3));
    }
}
