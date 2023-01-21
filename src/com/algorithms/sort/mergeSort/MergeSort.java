package com.algorithms.sort.mergeSort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {
    public static<T extends Comparable<T>> void sort(T[] arr) {

    }

    public static<T extends Comparable<T>> T[] merge(T[] arr1, T[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int length = arr1Length + arr2Length;
        int i1 = 0;
        int i2 = 0;
        List<T> arrayList = new ArrayList<>(length);
        while (arrayList.get(length - 1) == null) {
            if (arr1[i1].compareTo(arr2[i2]) < 0) {
                arrayList.add(arr1[i1]);
                i1++;
            }
            else {
                arrayList.add(arr2[i2]);
                i2++;
            }
        }
        // return arrayList.toArray();
        return arr1;
    }
}
