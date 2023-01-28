package com.coderbytes.bitwiseOne;

public class BitwiseOne {
    public static String bitwiseOne(String[] strArr) {
        int length = strArr[0].length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            if (strArr[0].charAt(i) == '1' || strArr[1].charAt(i) == '1') {
                sb.append("1");
                continue;
            }
            sb.append("0");
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        String[] arr1 = {"100", "000"};
        String[] arr2 = {"00011", "01010"};
        String[] arr3 = {"1001", "0100"};
        System.out.println(bitwiseOne(arr1));
        System.out.println(bitwiseOne(arr2));
        System.out.println(bitwiseOne(arr3));
    }
}
