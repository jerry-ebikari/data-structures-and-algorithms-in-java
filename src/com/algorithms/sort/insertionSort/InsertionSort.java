package com.algorithms.sort.insertionSort;

public class InsertionSort<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insert(i, arr);
        }
        return arr;
    }

    public static <T extends Comparable<T>> void insert(int i, T[] arr) {
        for (int j = i; j > 0; j--) {
            T elementToInsert = arr[j];
            T elementToCheckAgainst = arr[j - 1];
            // if elementToInsert < elementToCheckAgainst
            if (elementToInsert.compareTo(elementToCheckAgainst) < 0) {
                // SWAP ELEMENT POSITIONS
                arr[j] = elementToCheckAgainst;
                arr[j - 1] = elementToInsert;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        String[] words = {"Hi", "Hey", "Abs"};
        Integer[] numbers = {4, -2, 2, 1};
        sort(words);
        sort(numbers);

        System.out.println("Sorted Words");
        for (String word: words) {
            System.out.println(word);
        }

        System.out.println("Sorted Numbers");
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
