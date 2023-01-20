package com.coderbytes.letterCount1;

import java.util.HashMap;
import java.util.Map;

public class LetterCount1 {
    public static String letterCount(String str) {
        if (str.length() == 0) return "-1";
        String[] originalWords = str.split(" ");
        str = str.toLowerCase();
        String[] words = str.split(" ");
        int maxRepeatingIndex = 0;
        int maxRepititions = 1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                int repititions = Integer.parseInt(getMaxRepeatingCharacter(words[i]).split(" ")[1]);
                if (repititions > maxRepititions) {
                    maxRepeatingIndex = i;
                    maxRepititions = repititions;
                }
            }
        }
        if (maxRepititions > 1) return originalWords[maxRepeatingIndex];
        return "-1";
    }

    public static String getMaxRepeatingCharacter(String word) {
        if (word.length() == 0) return "";
        Map<String, Integer> wordMap = covertStringtoMap(word);
        int max = 0;
        String maxChar = "";
        for (String character: wordMap.keySet()) {
            if (wordMap.get(character) > max) {
                maxChar = character;
                max = wordMap.get(character);
            }
        }
        return maxChar + " " + max;
    }

    public static Map<String, Integer> covertStringtoMap(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        char[] characters = str.toCharArray();
        for (char character: characters) {
            if (map.get(character + "") != null) {
                Integer i = map.get(character + "");
                map.put(character + "", i + 1);
            }
            else {
                map.put(character + "", 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(letterCount("Hello apple pie"));
        System.out.println(letterCount("No Words"));
        System.out.println(letterCount("Today, is the greatest day ever!"));
    }

    
}
