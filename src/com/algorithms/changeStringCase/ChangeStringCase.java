package com.algorithms.changeStringCase;

public class ChangeStringCase {

    private static String changeCharactersCase(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isLowerCase(c[i])) {
                c[i] = Character.toUpperCase(c[i]);
            } else if (Character.isUpperCase(c[i])) {
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        String str = changeCharactersCase("aBcDeFgHiJkLmNoP");
        System.out.println(str);
    }
}
