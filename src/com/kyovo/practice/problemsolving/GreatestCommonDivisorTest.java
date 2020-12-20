package com.kyovo.practice.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void findByBrutForce() {
        assertEquals(4, GreatestCommonDivisor.findByBrutForce(20, 28));
        assertEquals(14, GreatestCommonDivisor.findByBrutForce(98, 56));
    }

    @Test
    void findByRecursion() {
        assertEquals(4, GreatestCommonDivisor.findByRecursion(20, 28));
        assertEquals(14, GreatestCommonDivisor.findByRecursion(98, 56));
    }
}