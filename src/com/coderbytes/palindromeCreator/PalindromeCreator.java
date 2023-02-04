package com.coderbytes.palindromeCreator;

public class PalindromeCreator {
    public static String palindromeCreator(String str) {
        if (isPalindrome(str)) {
            return "palindrome";
        }
        String shortest = "";
        boolean found = false;
        int max = (int) Math.pow(2, str.length());
        for (int i = 0; i < max; i++) {
            String binaryString = Integer.toString(i, 2);
            String elem = getWordFromBinaryString(str, binaryString);
            if (elem.length() > 2 && (str.length() - elem.length() < 3) && isPalindrome(elem)) {
                String missingCharacters = getMissingCharacters(str, binaryString);
                if (missingCharacters.length() < shortest.length() || shortest.length() == 0) {
                    shortest = missingCharacters;
                    found = true;
                }
            }
        }
        return found ? shortest : "not possible";
    }

    public static String getWordFromBinaryString(String str, String binaryString) {
        int padding = str.length() - binaryString.length();
        binaryString = "0".repeat(padding) + binaryString;
        String elem = "";
        for (int i = 0, max = binaryString.length(); i < max; i++) {
            if (binaryString.charAt(i) == '1') {
                elem += str.charAt(i) + "";
            }
        }
        return elem;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String getMissingCharacters(String str, String binaryString) {
        String result = "";
        int padding = str.length() - binaryString.length();
        binaryString = "0".repeat(padding) + binaryString;
        for (int i = 0; i < str.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                result += str.charAt(i) + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCreator("mmop"));
        System.out.println(palindromeCreator("kjjjhjjj"));
        System.out.println(palindromeCreator("abjchba"));
    }
}
