package com.coderbytes.swapCase;

public class SwapCase {
    public static String swapCase(String str) {
        char[] arr = str.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                if (Character.isUpperCase(arr[i]) || Character.isTitleCase(arr[i])) {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                else if (Character.isLowerCase(arr[i])) {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(swapCase("Hello-LOL"));
        System.out.println(swapCase("Sup DUDE!!?"));
    }
}
