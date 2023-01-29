package com.coderbytes.binaryReversal;

public class BinaryReversal {
    public static String binaryReversal(String str) {
        int decimalNumber = Integer.parseInt(str);
        String binaryString = Integer.toString(decimalNumber, 2);
        int binaryStringLength = binaryString.length();
        // pad binary string if necessary
        int padding = binaryStringLength % 8;
        if (padding != 0) {
            binaryString = "0".repeat(8 - padding) + binaryString;
        }
        // reverse the binary string
        StringBuilder sb = new StringBuilder(binaryString).reverse();
        // convert from binary to decimal
        decimalNumber = Integer.parseInt(sb.toString(), 2);
        return decimalNumber + "";
    }

    public static void main(String[] args) {
        System.out.println(binaryReversal("213"));
        System.out.println(binaryReversal("4567"));
        System.out.println(binaryReversal("47"));
    }
}
