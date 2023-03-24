package com.algorithms.checkRepeated;

public class CheckRepeated {

    public static boolean checkRepeated(String str) {
        return str.matches(".*(.)(?=.*\\1).*");
    }

    public static void main(String[] args) {
        System.out.println(checkRepeated("jerry"));
    }
}
