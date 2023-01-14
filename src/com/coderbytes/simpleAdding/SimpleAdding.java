package com.coderbytes.simpleAdding;

public class SimpleAdding {
    public static long sumUpToN(long n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        System.out.println(sumUpToN(12));
        System.out.println(sumUpToN(140));
    }
}
