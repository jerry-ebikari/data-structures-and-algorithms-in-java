package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        Map<String, Integer> charMap1 = convertToCharacterMap(str1);
        Map<String, Integer> charMap2 = convertToCharacterMap(str2);
        return charMap1.equals(charMap2);
    }

    public static Map<String, Integer> convertToCharacterMap(String str) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                String character = Character.toString(str.charAt(i));
                if (myMap.containsKey(character)) {
                    int numberOfOccurences = myMap.get(character);
                    myMap.put(character, numberOfOccurences + 1);
                } else {
                    myMap.put(character, 1);
                }
            }
        }
        return myMap;
    }

    public static void main(String[] args) {
        String str1 = "hear";
        String str2 = "ha re";
        System.out.println(isAnagram(str1, str2));
    }
}
