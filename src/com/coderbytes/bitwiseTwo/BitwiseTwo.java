package com.coderbytes.bitwiseTwo;

public class BitwiseTwo {
    public static String bitwiseTwo(String[] strArr) {
        String str1 = strArr[0];
        String str2 = strArr[1];
        int length = str1.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == '1' && str2.charAt(i) == '1') {
                sb.append('1');
            }
            else {
                sb.append('0');
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        String[] arr1 = {"100", "000"};
        String[] arr2 = {"10100", "11100"};
        String[] arr3 = {"10111", "01101"};
        System.out.println(bitwiseTwo(arr1));
        System.out.println(bitwiseTwo(arr2));
        System.out.println(bitwiseTwo(arr3));
    }
}
