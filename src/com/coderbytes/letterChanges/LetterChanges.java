package com.coderbytes.letterChanges;

import java.util.Arrays;

public class LetterChanges {
    public static String letterChanges(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (char character: charArray) {
            if (Character.isLetter(character)) {
                if (character != 'z') {
                    sb.append((char)(character + 1));
                }
                else {
                    sb.append('a');
                }
            }
            else {
                sb.append(character);
            }
        }
        return makeVowelsUppercase(sb.toString());
    }

    public static String makeVowelsUppercase(String str) {
        char[] charArray = str.toCharArray();
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder(str.length());
        for (char character: charArray) {
            if (vowels.contains(character + "")) {
                sb.append(Character.toUpperCase(character));
            }
            else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
      System.out.println(letterChanges("hello*3"));
      System.out.println(letterChanges("fun times!"));
    }
}
