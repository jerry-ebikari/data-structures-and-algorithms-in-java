package com.coderbytes.largestPair;

import java.util.ArrayList;
import java.util.List;

public class LargestPair {
    public static int largestPair(int num) {
        String numString = Integer.toString(num);
        List<String> twoDigitNumbers = new ArrayList<>();
        int numberOfDigits = numString.length();
        for (int i = 0; i < numberOfDigits - 1; i++) {
            twoDigitNumbers.add(numString.charAt(i) + "" + numString.charAt(i + 1));
        }
        int maximum = 0;
        for (String number: twoDigitNumbers) {
            if (Integer.parseInt(number) > maximum) {
                maximum = Integer.parseInt(number);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println(largestPair(453857));
        System.out.println(largestPair(363223311));
        System.out.println(largestPair(4759472));
    }
}
