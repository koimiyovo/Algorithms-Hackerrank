package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.twodarrayds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDsTest {

    @Test
    void hourglassSum() {
        assertEquals(19, ArrayDs.hourglassSum(new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}));
}
}