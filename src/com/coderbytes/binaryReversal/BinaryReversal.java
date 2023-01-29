package com.coderbytes.binaryReversal;

public class BinaryReversal {
    public static String binaryReversal(String str) {
        String binary = decimalToBinary(Integer.parseInt(str));
        binary = new StringBuilder(binary).reverse().toString();
        return binaryToDecimal(binary) + "";
    }

    public static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        int padding = sb.length() % 8;
        if (padding != 0) {
            padding = 8 - padding;
            for (int i = 0; i < padding; i++) {
                sb.append("0");
            }
        }
        return new String(sb.reverse());
    }

    public static int binaryToDecimal(String str) {
        int length = str.length();
        int decimal = 0;
        for (int i = 0; i < length; i++) {
            decimal += Integer.parseInt(str.charAt(i) + "") * Math.pow(2, length - i - 1);
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryReversal("213"));
        System.out.println(binaryReversal("4567"));
        System.out.println(binaryReversal("47"));
    }
}
