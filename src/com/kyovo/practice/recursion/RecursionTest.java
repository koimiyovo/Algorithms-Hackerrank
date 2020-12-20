package com.kyovo.practice.recursion;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void fact() {
        assertEquals(6, Recursion.fact(3));
    }

    @Test
    void fib() {
        assertEquals(3, Recursion.fib(4));
    }

    @Test
    void fibSequences() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        assertEquals(expected, Recursion.fibSequences(4));
    }

    @Test
    void numWays() {
        assertEquals(5, Recursion.numWays(4));
    }

    @Test
    void isPalindrome() {
        assertTrue(Recursion.isPalindrome("abxba"));
        assertTrue(Recursion.isPalindrome("malayalam"));

        assertFalse(Recursion.isPalindrome("abaca"));
    }
}