package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.timeconversion;

public class TimeConversion {
    public static String timeConversion(String time) {
        String militaryTime;
        if (isInMorning(time)) {
            militaryTime = extractTimeWithoutPeriod(time);
        } else {
            int hour = convertHourToMilitary(extractHourFrom(time));
            militaryTime = addZero(hour) + ":" + extractMinutesFrom(time) + ":" + extractSecondsFrom(time);
        }
        return militaryTime;
    }

    private static int convertHourToMilitary(int hour) {
        hour += 12;
        return hour % 24;
    }

    private static boolean isInMorning(String time) {
        int hour = extractHourFrom(time);
        return (hour < 12 && isTimeAM(time)) || (hour == 12 && isTimePM(time));
    }

    private static String addZero(int n) {
        return String.format("%02d", n);
    }

    public static int extractHourFrom(String time) {
        return Integer.parseInt(time.substring(0, 2));
    }

    private static String extractMinutesFrom(String time) {
        return time.substring(3, 5);
    }

    private static String extractSecondsFrom(String time) {
        return time.substring(6, 8);
    }

    private static String extractTimeWithoutPeriod(String time) {
        return time.substring(0, 8);
    }

    private static boolean isTimeAM(String time) {
        return time.contains("AM");
    }

    private static boolean isTimePM(String time) {
        return time.contains("PM");
    }
}
