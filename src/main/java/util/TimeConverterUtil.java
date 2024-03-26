package util;

import static com.example.britishtimeconvert.TimeConverter.numbers;
import static com.example.britishtimeconvert.TimeConverter.tens;

public class TimeConverterUtil {

    public static String getMinutesPast(int minute) {
        if (minute < 20) {
            return numbers[minute];
        } else {
            return tens[minute / 10] + ((minute % 10 != 0) ? " " + numbers[minute % 10] : "");
        }
    }

    public static String getMinutesTo(int minute) {
        minute = 60 - minute;
        if (minute < 20) {
            return numbers[minute];
        } else {
            return tens[minute / 10] + ((minute % 10 != 0) ? " " + numbers[minute % 10] : "");
        }
    }
}
