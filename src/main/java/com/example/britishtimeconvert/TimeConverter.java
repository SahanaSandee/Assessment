package com.example.britishtimeconvert;

import java.util.HashMap;
import java.util.Map;

import static util.TimeConverterUtil.getMinutesPast;
import static util.TimeConverterUtil.getMinutesTo;

public class TimeConverter {

    public static final String[] numbers = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
    public static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};
    private static final String[] specialCases = {"midnight", "noon"};
    private static final String PAST = "past";
    private static final String TO = "to";
    private static final String OCLOCK = "o'clock";
    private static final String HALF_PAST = "half";
    private static final String QUARTER = "quarter";
    public static String convertToBritishSpokenForm(String time) {

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        String spokenForm;
        if (minute == 0) {
            spokenForm = (hour == 0) ? specialCases[0] : (hour == 12) ? specialCases[1] : numbers[hour] + " " + OCLOCK;
        } else if (minute == 30) {
            spokenForm = HALF_PAST + " " + PAST + " " + numbers[hour];
        } else if (minute == 15) {
            spokenForm = QUARTER + " " + PAST + " " + numbers[hour];
        } else if (minute == 45) {
            spokenForm = QUARTER + " " + TO + " " + numbers[(hour + 1) % 12];
        } else if (minute < 30) {
            spokenForm = getMinutesPast(minute) + " " + PAST + " " + numbers[hour];
        } else {
            if (minute == 55) {
                spokenForm = getMinutesTo(minute) + " " + TO + " " + specialCases[1];
            } else {
                spokenForm = getMinutesTo(minute) + " " + TO + " " + numbers[(hour + 1) % 12];
            }
        }

        return spokenForm;

    }

}
