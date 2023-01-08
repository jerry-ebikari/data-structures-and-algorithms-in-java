package com.algorithms.sort.bubbleSort;

// Algorithm is type generic
// Doesn't work for native types like int, double
// Works with types like Integer, Double, String...

public class BubbleSort<T extends Comparable<T>> {
    // Equivalent int sorting algorithm header would be:
      // public static int[] sort(int[] arr)
    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        boolean swapped = true;
        int length = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < length - 1; i++) {
                // if arr[i] > arr[i + 1]
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(i, i + 1, arr);
                    swapped = true;
                }
            }
            length--;
        }
        return arr;
    }
    
    // SWAP ARRAY VALUES
    private static <T extends Comparable<T>> void swap(int index1, int index2, T[] arr) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // TEST
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