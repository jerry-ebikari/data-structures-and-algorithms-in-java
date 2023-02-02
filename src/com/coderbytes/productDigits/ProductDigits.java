package com.coderbytes.productDigits;

public class ProductDigits {
    public static int productDigits(int num) {
        double maxPossibleQuotient = Math.sqrt(num);
        int minLength = Integer.toString(num).length() + 1;
        for (int i = 2; i <= maxPossibleQuotient; i++) {
            if (num % i == 0) {
                int divisor1 = i;
                int divisor2 = num / i;
                String divisorsCombined = divisor1 + "" + divisor2;
                if (minLength > divisorsCombined.length()) {
                    minLength = divisorsCombined.length();
                }
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(productDigits(6));
        System.out.println(productDigits(23));
        System.out.println(productDigits(24));
    }
}
