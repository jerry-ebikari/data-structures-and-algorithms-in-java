package com.coderbytes.nonRepeatingCharacter;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static char nonRepeatingCharacter(String str) {
        char[] characters = str.toCharArray();
        int numberOfCharacters = characters.length;
        boolean isNonRepeating = true;
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < numberOfCharacters - 1; i++) {
            isNonRepeating = true;
            for (int j = i + 1; j < numberOfCharacters; j++) {
                if (map.get(characters[i]) != null || characters[i] == (characters[j])) {
                    isNonRepeating = false;
                    if (map.get(characters[i]) == null) {
                        map.put(characters[i], true);
                    }
                    break;
                }
            }
            if (isNonRepeating) return characters[i];
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("abcdef"));
        System.out.println(nonRepeatingCharacter("hello world hi hey"));
        System.out.println(nonRepeatingCharacter("agettkgaeee"));
    }
}
