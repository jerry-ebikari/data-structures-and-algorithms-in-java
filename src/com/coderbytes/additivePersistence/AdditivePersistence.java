package com.coderbytes.additivePersistence;

public class AdditivePersistence {
    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int additivePersistence(int num) {
        int count = 0;
        while (num > 9) {
            num = getSumOfDigits(num);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(additivePersistence(4));
        System.out.println(additivePersistence(19));
        System.out.println(additivePersistence(2718));
    }
}
