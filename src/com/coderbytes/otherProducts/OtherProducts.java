package com.coderbytes.otherProducts;

public class OtherProducts {
    public static String otherProducts(int[] arr) {
        long product = 1;
        for (int i: arr) {
            product *= i;
        }
        int length = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(product / arr[i]);
            if (i < length - 1) {
                sb.append("-");
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,3};
        int[] arr2 = {3,1,2,6};
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(otherProducts(arr1));
        System.out.println(otherProducts(arr2));
        System.out.println(otherProducts(arr3));
    }
}
