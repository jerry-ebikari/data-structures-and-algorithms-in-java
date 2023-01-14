package com.coderbytes.letterChanges;

public class LetterChanges {
    public static String letterChanges(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        String vowels = "aeiou";
        for (char character: charArray) {
            if (Character.isLetter(character)) {
                if (character != 'z') {
                    char nextCharacter = (char)(character + 1);
                    if (vowels.contains(nextCharacter + "")) {
                        char c = Character.toUpperCase(nextCharacter);
                        sb.append(c);
                    }
                    else {
                        sb.append(nextCharacter);
                    }
                }
                else {
                    sb.append('A');
                }
            }
            // if character is not a letter
            else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
      System.out.println(letterChanges("hello*3"));
      System.out.println(letterChanges("fun times!"));
      System.out.println(letterChanges("abcdefghijklmnopqrstuvwxyz"));
    }
}
