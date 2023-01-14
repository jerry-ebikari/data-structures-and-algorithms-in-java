package com.coderbytes.simpleAdding;

public class SimpleAdding {
    public static long sumUpToN(long n) {
        return n * (n + 1) / 2;
    }

    public static long iterativeSumUpToN(long n) {
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(iterativeSumUpToN(12));
        System.out.println(iterativeSumUpToN(140));
    }
}
