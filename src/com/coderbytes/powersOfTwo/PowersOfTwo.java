package com.coderbytes.powersOfTwo;

public class PowersOfTwo {
    public static String powersOfTwo(int num) {
        if (num == 1 || num < 0) return "false";
        if (num == 0) return "true";
        while (num > 1) {
            if (num % 2 != 0) {
                return "false";
            }
            num /= 2;
        }
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(powersOfTwo(4));
        System.out.println(powersOfTwo(124));
        System.out.println(powersOfTwo(22));
        System.out.println(powersOfTwo(16));
    }
}
