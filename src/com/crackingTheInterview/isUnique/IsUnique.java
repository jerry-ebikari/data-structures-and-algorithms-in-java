package com.crackingTheInterview.isUnique;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    // Implementation with hash map
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

    // Implementation without any data structures
    public static boolean isUnique2(String str) {
        int maxCharIndex = str.length() - 1;
        for (int i = 0; i < maxCharIndex; i++) {
            for (int j = i + 1; j <= maxCharIndex; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcdb";
        System.out.println(isUnique(str1));
        System.out.println(isUnique(str2));
        System.out.println(isUnique2(str1));
        System.out.println(isUnique2(str2));
    }
}
