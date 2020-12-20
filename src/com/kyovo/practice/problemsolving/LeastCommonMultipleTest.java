package com.kyovo.practice.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {

    @Test
    void find() {
        assertEquals(60, LeastCommonMultiple.find(15, 20));
        assertEquals(35, LeastCommonMultiple.find(5, 7));
    }
}