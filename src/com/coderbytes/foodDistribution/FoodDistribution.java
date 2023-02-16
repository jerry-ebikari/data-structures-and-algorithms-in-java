package com.coderbytes.foodDistribution;

public class FoodDistribution {
    public static int foodDistribution(int[] arr) {
        boolean foodGiven = true;
        while (foodGiven && arr[0] > 0) {
            foodGiven = false;
            int minIndex = getMinIndex(arr);
            int maxIndex = getMaxIndex(arr);
            if (arr[maxIndex] > arr[minIndex]) {
                foodGiven = true;
                arr[0]--;
                arr[maxIndex]--;
            }
        }
        
        int result = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            result += arr[i] - arr[i + 1];
        }
        return result;
    }

    public static int getMaxIndex(int[] arr) {
        int maxIndex = 1;
        int max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] >= max) {
                maxIndex = i;
                max = arr[i];
            }
        }
        return maxIndex;
    }

    public static int getMinIndex(int[] arr) {
        int minIndex = 1;
        int min = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                minIndex = i;
                min = arr[i];
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 3, 4, 5};
        int[] arr2 = {3, 2, 1, 0, 4, 1, 0};
        int[] arr3 = {5, 3, 1, 2, 1};
        int[] arr4 = {4, 5, 2, 3, 1, 0};
        System.out.println(foodDistribution(arr1));
        System.out.println(foodDistribution(arr2));
        System.out.println(foodDistribution(arr3));
        System.out.println(foodDistribution(arr4));
    }
}