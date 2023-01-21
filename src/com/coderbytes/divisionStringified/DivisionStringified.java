package com.coderbytes.divisionStringified;

public class DivisionStringified {
    public static String divisionStringified(int num1, int num2) {
        int quotient = num1 / num2;
        if (num1 % num2 != 0) {
            quotient++;
        }
        String str = Integer.toString(quotient);
        str = reverseString(str);
        str = str.replaceAll("(.{3})(?=.)", "$1,");
        return reverseString(str);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(divisionStringified(5, 2));
        System.out.println(divisionStringified(6874, 67));
        System.out.println(divisionStringified(123456789, 10000));
    }
}
