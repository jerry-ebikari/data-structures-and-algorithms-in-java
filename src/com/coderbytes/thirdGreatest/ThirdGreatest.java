package com.coderbytes.thirdGreatest;

public class ThirdGreatest {
    public static String thirdGreatest(String[] strArr) {
        int length = strArr.length;
        String[] arrCopy = java.util.Arrays.copyOf(strArr, length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrCopy[j].length() < arrCopy[j + 1].length()) {
                    String temp = arrCopy[j];
                    arrCopy[j] = arrCopy[j + 1];
                    arrCopy[j + 1] = temp;
                }
            }
        }
        int i = 2;
        String result = arrCopy[i];
        while(arrCopy[i].length() >= arrCopy[0].length()) {
            result = arrCopy[i];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"coder","byte","code"};
        String[] arr2 = {"abc","defg","z","hijk"};
        String[] arr3 = {"hello", "world", "before", "all"};
        String[] arr4 = {"hello", "world", "after", "all"};
        System.out.println(thirdGreatest(arr1));
        System.out.println(thirdGreatest(arr2));
        System.out.println(thirdGreatest(arr3));
        System.out.println(thirdGreatest(arr4));
    }
}
