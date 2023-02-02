package com.coderbytes.productDigits;

import java.util.ArrayList;
import java.util.List;

public class ProductDigits {
    public static int productDigits(int num) {
        List<Integer> quotients = getQuotients(num);
        int length = quotients.size();
        int maxDigits = 0;
        for (int i = 0, j = length - 1; i <= j; i++, j--) {
            int productLength = (quotients.get(i) + "" + quotients.get(j)).length();
            if (productLength > maxDigits) {
                maxDigits = productLength;
            }
        }
        return maxDigits;
    }

    public static List<Integer> getQuotients(int num) {
        List<Integer> quotients = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                quotients.add(i);
            }
        }
        return quotients;
    }

    public static void main(String[] args) {
        System.out.println(productDigits(6));
        System.out.println(productDigits(23));
        System.out.println(productDigits(24));
    }
}
