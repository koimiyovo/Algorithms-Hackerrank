package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.repeatedstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    @Test
    void repeatedString() {
        assertEquals(7, RepeatedString.repeatedString("aba", 10));
        assertEquals(1000000000000L, RepeatedString.repeatedString("a", 1000000000000L));
    }

    @Test
    void buildStringToConsider() {
        assertEquals("abcacabcac", RepeatedString.buildStringToConsider("abcac", 10));
    }
}