package com.coderbytes.basicRomanNumerals;

import java.util.HashMap;

public class BasicRomanNumerals {
    public static HashMap<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public static int romanToInteger(String romanStr) {
        if (romanStr.length() == 1) {
            return romanMap.get(romanStr.charAt(0));
        }
        int result = 0;
        int i = 1;
        while(i < romanStr.length()) {
            char c = romanStr.charAt(i - 1);
            char c2 = romanStr.charAt(i);
            if (i == romanStr.length() - 1 || romanMap.get(c2) >= romanMap.get(romanStr.charAt(i+1))) {
                result += romanMap.get(c2);
            }
            if (romanMap.get(c) < romanMap.get(c2)) {
                result -=  romanMap.get(c);
            }
            else if (i == 1) {
                result += romanMap.get(c);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("XXIV"));
    }
}
