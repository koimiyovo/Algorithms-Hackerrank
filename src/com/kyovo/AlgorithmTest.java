package com.kyovo;

import static com.kyovo.utils.Utils.printArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    String[] strings;

    @BeforeEach
    void setup() {
        strings = new String[] {"abalo", "kofi", "jean", "afi", "carlos"};
    }

    @Test
    void findLongestString() {
        assertEquals("carlos", Algorithm.findLongestString(strings));
    }

    @Test
    void completeStrings() {
        String[] expected = {"abaloz", "kofizz", "jeanzz", "afizzz", "carlos"};
        String[] result = Algorithm.completeStringsWith(strings, 'z');
        assertEquals(printArray(expected), printArray(result));
    }
}