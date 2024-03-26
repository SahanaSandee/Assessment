package com.example.britishtimeconvert;

import org.junit.jupiter.api.Test;

import static com.example.britishtimeconvert.TimeConverter.convertToBritishSpokenForm;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConverterTest {

    @Test
    public void testConvertToBritishSpokenForm() {
        assertEquals("one o'clock", convertToBritishSpokenForm("1:00"));
        assertEquals("five past two", convertToBritishSpokenForm("2:05"));
        assertEquals("ten past three", convertToBritishSpokenForm("3:10"));
        assertEquals("quarter past four", convertToBritishSpokenForm("4:15"));
        assertEquals("twenty past five", convertToBritishSpokenForm("5:20"));
        assertEquals("twenty five past six", convertToBritishSpokenForm("6:25"));
        assertEquals("half past seven", convertToBritishSpokenForm("7:30"));
        assertEquals("twenty five to eight", convertToBritishSpokenForm("7:35"));
        assertEquals("twenty to nine", convertToBritishSpokenForm("8:40"));
        assertEquals("quarter to ten", convertToBritishSpokenForm("9:45"));
        assertEquals("ten to eleven", convertToBritishSpokenForm("10:50"));
        assertEquals("ten to twelve", convertToBritishSpokenForm("11:50"));
        assertEquals("five to noon", convertToBritishSpokenForm("11:55"));
        assertEquals("midnight", convertToBritishSpokenForm("00:00"));
        assertEquals("noon", convertToBritishSpokenForm("12:00"));
    }

}
