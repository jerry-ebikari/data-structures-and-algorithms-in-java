package com.coderbytes.firstReverse;

public class FirstReverse {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverseWithArray(String str) {
        char[] arr = str.toCharArray();
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverse("coderbyte"));
        System.out.println(reverse("I Love Code"));
    }
}
