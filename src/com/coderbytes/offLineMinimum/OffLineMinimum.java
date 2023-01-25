package com.coderbytes.offLineMinimum;

import java.util.ArrayList;
import java.util.List;

public class OffLineMinimum {
    public static String offLineMinimum(String[] strArr) {
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> smallestNumbers = new ArrayList<>();
        for (String str: strArr) {
            if ("E".equals(str)) {
                moveSmallestFrom(allNumbers, smallestNumbers);
            }
            else {
                allNumbers.add(Integer.parseInt(str));
            }
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (Integer i: smallestNumbers) {
            sb.append(i + "");
            if (j != smallestNumbers.size() - 1) {
                sb.append(",");
            }
            j++;
        }
        return new String(sb);
    }

    // Move smallest from list 1 to list 2
    public static void moveSmallestFrom(List<Integer> allNumbers, List<Integer> smallestNumbers) {
        if (allNumbers.size() == 0) return;
        Integer smallest = allNumbers.get(0);
        for (Integer i: allNumbers) {
            if (smallest > i) {
                smallest = i;
            }
        }
        smallestNumbers.add(smallest);
        allNumbers.remove(smallest);
    }


    public static <T extends Comparable<T>> void printArr(T[] arr) {
        for (T elem: arr) {
            System.out.print(elem);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] arr1 = {"1","2","E","E","3"};
        String[] arr2 = {"4","E","1","E","2","E","3","E"};
        String[] arr3 = {"5","4","6","E","1","7","E","E","3","2"};
        System.out.println(offLineMinimum(arr1));
        System.out.println(offLineMinimum(arr2));
        System.out.println(offLineMinimum(arr3));
    }
}
