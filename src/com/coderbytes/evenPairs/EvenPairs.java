package com.coderbytes.evenPairs;

public class EvenPairs {
    public static String evenPairs(String str) {
        String newStr = str.replaceAll("[^\\d]+", " ").trim();
        String[] numbers = newStr.split(" ");
        String evenNumberEnding = "02468";
        for (String number: numbers) {
            int count = 0;
            for (int i = 0; i < number.length(); i++) {
                if (evenNumberEnding.contains(number.charAt(i) + "")) {
                    count++;
                }
            }
            if (count > 1) {
                return "true";
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(evenPairs("3gy41d216"));
        System.out.println(evenPairs("f09r27i8e67"));
        System.out.println(evenPairs("f178svg3k19k46"));
        System.out.println(evenPairs("7r5gg812"));
    }
}
