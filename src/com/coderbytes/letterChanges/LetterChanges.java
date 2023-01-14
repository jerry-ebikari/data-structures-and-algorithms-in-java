package com.coderbytes.letterChanges;

public class LetterChanges {
    public static String letterChanges(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();
        for (char character: charArray) {
            if (Character.isLetter(character)) {
                sb.append(encode(character));
            }
            else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static char encode(char letter) {
        // if character is not z
        if (letter != 'z') {
            String vowels = "aeiou";
            char nextCharacter = (char)(letter + 1);
            // if next character is a vowel
            if (vowels.contains(nextCharacter + "")) {
                char c = Character.toUpperCase(nextCharacter);
                return c;
            }
            // if next character is not a vowel
            else {
                return nextCharacter;
            }
        }
        // if character is z
        else {
            return 'A';
        }
    }

    public static void main(String[] args) {
      System.out.println(letterChanges("hello*3"));
      System.out.println(letterChanges("fun times!"));
      System.out.println(letterChanges("a b c d e f g h i j k l m n o p q r s t u v w x y z"));
    }
}
