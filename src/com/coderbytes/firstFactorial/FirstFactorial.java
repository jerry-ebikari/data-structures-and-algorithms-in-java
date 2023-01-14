package com.coderbytes.firstFactorial;

public class FirstFactorial {
    public static long factorial(long n) {
        if (n < 0) return 0;
        if (n < 1) return 1;
        return n * factorial(n - 1);
    }

    public static long iterativeFactorial(long n) {
        if (n < 0) return 0;
        if (n < 1) return 1;
        long factorial = 1;
        for (long i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
