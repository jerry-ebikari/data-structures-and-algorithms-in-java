package com.coderbytes.letterCapitalize;

public class LetterCapitalize {
    public static String letterCapitalize(String str) {
        // remove extra white spaces
        str = str.trim().replaceAll("\\s{2,}", " ");
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

    public static String letterCapitalize2(String str) {
        // remove extra white spaces
        str = str.trim().replaceAll("\\s{2,}", " ");
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: words) {
            String capitalizedFirstLetter = word.substring(0, 1).toUpperCase();
            String restOfWord = word.substring(1);
            String captializedWord = capitalizedFirstLetter + restOfWord;
            sb.append(captializedWord + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
        System.out.println(letterCapitalize("i ran there"));
    }
}
