package com.coderbytes.letterCapitalize;

public class LetterCapitalize {
    public static String letterCapitalize(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        char previousChar = ' ';
        for (char character: charArray) {
            if (previousChar == ' ') {
                sb.append(Character.toUpperCase(character));
            }
            else {
                sb.append(character);
            }
            previousChar = character;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
        System.out.println(letterCapitalize("i ran there"));
    }
}
