package com.coderbytes.countingMinutes1;

public class CountingMinutes1 {
    public static int getHour(String str) {
        return Integer.parseInt(str.split(":")[0]);
    }

    public static int getMinutes(String str) {
        int length = str.length();
        return Integer.parseInt(str.charAt(length - 4) + "" + str.charAt(length - 3));
    }

    public static String getHalfOfDay(String str) {
        int length = str.length();
        return str.charAt(length - 2) + "" + str.charAt(length - 1);
    }

    public static int countingMinutes(String str) {
        String[] times = str.split("-");
        String from = times[0];
        String to = times[1];
        // (am to am) OR (pm to pm)
        if (getHalfOfDay(from).equals(getHalfOfDay(to))) {
            boolean fromGreaterThanTo = (
                getHour(from) > getHour(to) ||
                getHour(from) == getHour(to) && getMinutes(from) > getMinutes(to)
            );
            int differenceInMinutes = 60 * (getHour(from) - getHour(to)) + getMinutes(from) - getMinutes(to);
            if (fromGreaterThanTo) {
                return (24 * 60) - differenceInMinutes;
            }
            else {
                return Math.abs(differenceInMinutes);
            }
        }
        // (am to pm) OR (pm to am)
        else {
            int differenceInMinutes = 60 * (getHour(to) - getHour(from)) + getMinutes(to) - getMinutes(from);
            return 12 * 60 + differenceInMinutes;
        }
    }

    public static void main(String[] args) {
        // pm to am
        System.out.println(countingMinutes("12:00pm-11:30am"));
        System.out.println(countingMinutes("12:30pm-12:00am"));
        // am to pm
        System.out.println(countingMinutes("12:00am-11:30pm"));
        System.out.println(countingMinutes("12:30am-12:00pm"));
        // am to am
        System.out.println(countingMinutes("12:30am-12:50am"));
        System.out.println(countingMinutes("1:23am-1:08am"));
        // pm to pm
        System.out.println(countingMinutes("12:30pm-12:50pm"));
        System.out.println(countingMinutes("1:23pm-1:08pm"));
    }
}
