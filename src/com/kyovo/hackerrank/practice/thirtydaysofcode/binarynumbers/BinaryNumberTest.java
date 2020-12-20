package com.kyovo.hackerrank.practice.thirtydaysofcode.binarynumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {

    @Test
    void toBinary() {
        assertEquals("10", BinaryNumber.toBinary(2));
        assertEquals("1111101", BinaryNumber.toBinary(125));
    }

    @Test
    void findMaxNumberOfConsecutiveOnes() {
        assertEquals(3, BinaryNumber.findMaxNumberOfConsecutiveOnes("110111"));
        assertEquals(5, BinaryNumber.findMaxNumberOfConsecutiveOnes("1111101"));
       assertEquals(1, BinaryNumber.findMaxNumberOfConsecutiveOnes(BinaryNumber.toBinary(5)));
       assertEquals(2, BinaryNumber.findMaxNumberOfConsecutiveOnes(BinaryNumber.toBinary(13)));
       assertEquals(1, BinaryNumber.findMaxNumberOfConsecutiveOnes(5));
       assertEquals(2, BinaryNumber.findMaxNumberOfConsecutiveOnes(13));
    }
}