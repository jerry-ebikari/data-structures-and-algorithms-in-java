package com.algorithms.sort.selectionSort;

public class SelectionSort <T extends Comparable<T>> {
    public static <T extends Comparable<T>> void sort(T[] arr) {
        int indexToInsertSelectedElement = arr.length - 1;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            T maximum = arr[0];
            int greatestElementIndex = 0;
            for (int j = 1; j <= indexToInsertSelectedElement; j++) {
                if (maximum.compareTo(arr[j]) < 0) {
                    maximum = arr[j];
                    greatestElementIndex = j;
                }
            }
            arr[greatestElementIndex] = arr[indexToInsertSelectedElement];
            arr[indexToInsertSelectedElement] = maximum;
            indexToInsertSelectedElement--;
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
