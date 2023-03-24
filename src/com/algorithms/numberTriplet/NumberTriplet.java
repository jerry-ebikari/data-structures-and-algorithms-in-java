package com.algorithms.numberTriplet;

public class NumberTriplet {

    static boolean numberTriplet(String str) {
        return str.matches(".*(\\d)+(?=(\\s\\1\\s){2}).*");
    }

    public static void main(String[] args) {
        
    }
}
