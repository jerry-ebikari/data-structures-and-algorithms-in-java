package com.crackingTheInterview.isUnique;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static boolean isUnique(String str) {
        Map<Character, Boolean> map = new HashMap<>();
        int maxCharIndex = str.length() - 1;
        for (int i = 0; i <= maxCharIndex; i++) {
            if (map.get(str.charAt(i)) != null) {
                return false;
            }
            map.put(str.charAt(i), true);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abcd"));
        System.out.println(isUnique("abcdb"));
    }
}
