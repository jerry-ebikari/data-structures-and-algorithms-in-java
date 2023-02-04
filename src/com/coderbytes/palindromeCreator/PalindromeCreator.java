package com.coderbytes.palindromeCreator;

public class PalindromeCreator {
    public static String palindromeCreator(String str) {
        if (isPalindrome(str)) {
            return "palindrome";
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                if (checkPalindromeWithBreakers(str, i, j) == i) {
                    return str.charAt(i) + "";
                }
                else if (checkPalindromeWithBreakers(str, i, j) == j) {
                    return str.charAt(j) + "";
                }
                else if (checkPalindromeWithBreakers(str, i, j) == i + j) {
                    return str.charAt(i) + "" + str.charAt(j);
                }
            }
        }
        return "not possible";
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static String removeCharAt(String str, int index) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
        return new String(sb);
    }

    public static int checkPalindromeWithBreakers(String str, int i, int j) {
        if (isPalindrome(removeCharAt(str, i))) {
            return i;
        }
        if (isPalindrome(removeCharAt(str, j))) {
            return j;
        }
        String str1 = removeCharAt(str, i);
        str1 = removeCharAt(str1, j - 1);
        if (isPalindrome(str1)) {
            return i + j;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCreator("mmop"));
        System.out.println(palindromeCreator("kjjjhjjj"));
        System.out.println(palindromeCreator("abjchba"));
    }
}
