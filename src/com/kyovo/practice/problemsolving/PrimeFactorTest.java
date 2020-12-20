package com.kyovo.practice.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    void find() {
        assertEquals("3 3 5 7 ", PrimeFactor.find(315));
    }

    @Test
    void find2() {
        assertEquals("3 3 5 7 ", PrimeFactor.find2(315));
    }
}