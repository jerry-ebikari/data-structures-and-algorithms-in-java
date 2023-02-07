package com.crackingTheInterview.checkPermutation;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static boolean checkPermutation(String str1, String str2) {
        Map<Character, Boolean> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map1.put(str1.charAt(i), true);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.put(str2.charAt(i), true);
        }
        
        //-----------------------------------------------
        // Check if map2 contains all characters in map1
        //-----------------------------------------------
        boolean isPermutation = true;
        for (char c: map1.keySet()) {
            if (map2.get(c) == null) {
                isPermutation = false;
                break;
            }
        }
        if (isPermutation) return true;
        
        //-----------------------------------------------
        // Check if map1 contains all characters in map2
        //-----------------------------------------------
        isPermutation = true;
        for (char c: map2.keySet()) {
            if (map1.get(c) == null) {
                isPermutation = false;
                break;
            }
        }
        if (isPermutation) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("abcd", "abe"));
        System.out.println(checkPermutation("abcd", "aaaa"));
    }
}
