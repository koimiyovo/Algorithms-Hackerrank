package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.countingvalleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void count() {
        assertEquals(2,  CountingValleys.count(11,"DUDDUUUUDDD"));
    }
}