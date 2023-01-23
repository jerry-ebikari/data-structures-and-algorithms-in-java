package com.coderbytes.multiplicativePersistence;

public class MultiplicativePersistence {
    public static int getProductOfDigits(int num) {
        int product = 1;
        while(num > 1) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
    public static int multiplicativePersistence(int num) {
        int count = 0;
        while (num > 9) {
            num = getProductOfDigits(num);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(multiplicativePersistence(4));
        System.out.println(multiplicativePersistence(25));
        System.out.println(multiplicativePersistence(39));
    }
}
