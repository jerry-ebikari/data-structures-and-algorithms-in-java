package com.coderbytes.timeConvert;

public class TimeConvert {
    public static String timeConvert(int num) {
        int minutes = num % 60;
        int hours = num / 60;
        return hours + ":" + minutes;
    }

    public static void main(String[] args) {
        System.out.println(timeConvert(126));
        System.out.println(timeConvert(45));
    }
}
