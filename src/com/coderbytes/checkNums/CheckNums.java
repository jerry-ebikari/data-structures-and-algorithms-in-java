package com.coderbytes.checkNums;

public class CheckNums {
    public static String checkNums(int num1, int num2) {
        if (num1 == num2) return "-1";
        return num2 > num1 ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(checkNums(3, 122));
        System.out.println(checkNums(67, 67));
    }
}
