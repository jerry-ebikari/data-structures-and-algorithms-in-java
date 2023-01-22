package com.coderbytes.numberAddition;

public class NumberAddition {
    public static int numberAddition(String str) {
        String[] arr = str.split("[^0-9]+");
        int sum = 0;
        for (String i: arr) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numberAddition("75Number9"));
        System.out.println(numberAddition("10 2One Number*1*"));
    }
}
