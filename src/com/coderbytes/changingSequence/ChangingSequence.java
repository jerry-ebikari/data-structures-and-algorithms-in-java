package com.coderbytes.changingSequence;

public class ChangingSequence {
    public static int changingSequence(int[] arr) {
        int length = arr.length;
        boolean sequenceIsIncreasing = false;
        int i = 0;
        while(i < length - 1) {
            if (arr[i] == arr[i + 1]) {
                i++;
                continue;
            }
            sequenceIsIncreasing = arr[i + 1] - arr[i] > 0;
            break;
        }
        for (; i < length - 1; i++) {
            if (arr[i + 1] - arr[i] > 0 != sequenceIsIncreasing) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {-4, -2, 9, 10};
        int[] arr2 = {5, 4, 3, 2, 10, 11};
        int[] arr3 = {1, 2, 4, 6, 4, 3, 1};
        int[] arr4 = {1, 1, 1, 2, 4, 6, 4, 3, 1};
        System.out.println(changingSequence(arr1));
        System.out.println(changingSequence(arr2));
        System.out.println(changingSequence(arr3));
        System.out.println(changingSequence(arr4));
    }
}
