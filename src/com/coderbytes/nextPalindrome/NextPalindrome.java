package com.coderbytes.nextPalindrome;

public class NextPalindrome {
    public static int nextPalindrome(int num) {
        num++;
        while(isPalindrome(num) == false) {
            num++;
        }
        return num;
    }

    public static boolean isPalindrome(int num) {
        String numString = Integer.toString(num);
        int length = numString.length();
        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (numString.charAt(i) != numString.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(nextPalindrome(2));
        System.out.println(nextPalindrome(180));
        System.out.println(nextPalindrome(24));
    }
}
