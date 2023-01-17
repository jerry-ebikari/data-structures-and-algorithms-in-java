package com.coderbytes.arrayAddition;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAddition {
    public static String arrayAddition(int[] arr) {
        Arrays.sort(arr);
        int arrLength = arr.length;
        int largest = arr[arrLength - 1];
        int sum = 0;
        return "";
    }

    public static ArrayList<int[]> combinations(int[] arr) {
        if (arr.length == 0) {
            int[] arr1 = {};
            ArrayList<int[]> result = new ArrayList<int[]>();
            result.add(arr1);
            return result;
        }
        int first = arr[0];
        int[] rest = Arrays.copyOfRange(arr, 1, arr.length);
        ArrayList<int[]> combinationsWithoutFirst = combinations(rest);
        ArrayList<int[]> combinationsWithFirst = new ArrayList<int[]>();
        for (int i = 0; i < combinationsWithoutFirst.size(); i++) {
            int[] element = combinationsWithoutFirst.get(i);
            combinationsWithFirst.add(addElementToArr(element, first));
        }
        ArrayList<int[]> result = new ArrayList<int[]>();
        for (int[] element: combinationsWithFirst) {
            result.add(element);
        }
        for (int[] element: combinationsWithoutFirst) {
            result.add(element);
        }
        return result;
    }

    public static void printArrayList(ArrayList<int[]> arr) {
        for (int[] element: arr) {
            printArray(element);
        }
    }

    public static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] addElementToArr(int[] arr, int elementToAdd) {
        int arrLength = arr.length;
        int[] newArr = new int[arrLength + 1];
        for (int i = 0; i < arrLength + 1; i++) {
            if (arrLength > i) {
                newArr[i] = arr[i];
                continue;
            }
            newArr[i] = elementToAdd;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,7,16,1,2};
        int[] arr2 = {3,5,-1,8,12};
        ArrayList<int[]> combination1 = combinations(arr1);
        ArrayList<int[]> combination2 = combinations(arr2);
    }
}
