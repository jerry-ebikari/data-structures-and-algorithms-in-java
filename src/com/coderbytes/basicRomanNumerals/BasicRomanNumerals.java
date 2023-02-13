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
        int result = 0;
        for (int i = 0; i < romanStr.length(); i++) {
            char c = romanStr.charAt(i);
            // If last character is encountered
            if (romanStr.length() - i < 2) {
                result += romanMap.get(c);
                break;
            }
            char c2 = romanStr.charAt(i + 1);

            // For patterns like IV, IX, XL, XC...
            if (romanMap.get(c) < romanMap.get(c2)) {
                result += romanMap.get(c2) - romanMap.get(c);
                i++;
                continue; 
            }

            result += romanMap.get(c) + romanMap.get(c2);
            i++;
            while (i < romanStr.length() - 1) {
                char c3 = romanStr.charAt(i + 1);
                if (c2 != c3) {
                    break;
                }
                result += romanMap.get(c3);
                c2 = c3;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("XII"));
    }
}
