package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.timeconversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void timeConversion() {
        assertEquals("00:01:00", TimeConversion.timeConversion("12:01:00AM"));
        assertEquals("12:01:00", TimeConversion.timeConversion("12:01:00PM"));
        assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
        assertEquals("07:05:45", TimeConversion.timeConversion("07:05:45AM"));
        assertEquals("22:05:45", TimeConversion.timeConversion("10:05:45PM"));
        assertEquals("23:05:45", TimeConversion.timeConversion("11:05:45PM"));
    }
}