package com.coderbytes.simpleAdding;

public class SimpleAdding {
    public static long sumUpToN(long n) {
        if (n < 1) return n;
        return n * (n + 1) / 2;
    }

    public static long iterativeSumUpToN(long n) {
        if (n < 1) return n;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long recursiveSumUpToN(long n) {
        if (n < 2) return n;
        return n + recursiveSumUpToN(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(sumUpToN(12));
        System.out.println(sumUpToN(140));
    }
}
