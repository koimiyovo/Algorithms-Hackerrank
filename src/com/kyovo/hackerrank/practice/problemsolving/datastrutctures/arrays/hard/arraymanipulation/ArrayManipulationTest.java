package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.hard.arraymanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {

    @Test
    void arrayManipulation() {
        assertEquals(10, ArrayManipulation.arrayManipulation(10, new int[][]{{1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}}));

        assertEquals(200, ArrayManipulation.arrayManipulation(5, new int[][]{{1, 2, 100},
                {2, 5, 100},
                {3, 4, 100}}));
    }
}