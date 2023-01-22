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

    public static int convertToMinutes(String str) {
        if (getHour(str) == 12) {
            return getMinutes(str) + ("pm".equals(getHalfOfDay(str)) ? 12 : 0) * 60;
        }
        if ("am".equals(getHalfOfDay(str))) {
            return getHour(str) * 60 + getMinutes(str);
        }
        return (12 + getHour(str)) * 60 + getMinutes(str);
    }

    public static int countingMinutes(String str) {
        String[] times = str.split("-");
        String from = times[0];
        String to = times[1];
        int difference = convertToMinutes(to) - convertToMinutes(from);
        if (difference < 0) return 24 * 60 + difference;
        return difference;
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
