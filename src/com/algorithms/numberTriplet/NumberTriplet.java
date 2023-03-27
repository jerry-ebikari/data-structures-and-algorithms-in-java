package com.algorithms.numberTriplet;

public class NumberTriplet {

    static boolean numberTriplet(String str) {
        return str.matches(".*(\\d+)(?=.*(?:\\s\\1).*).*");
    }

    public static void main(String[] args) {
        System.out.println(numberTriplet("10 men went on 10 dates with 10 women"));
    }
}
