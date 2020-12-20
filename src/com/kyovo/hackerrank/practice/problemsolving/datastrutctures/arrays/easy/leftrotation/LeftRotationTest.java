package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.leftrotation;

import org.junit.jupiter.api.Test;

import static com.kyovo.utils.Utils.printArray;
import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

    @Test
    void rotLeft() {
        int[] expected = {5, 1, 2, 3, 4};
        int[] a = {1, 2, 3, 4, 5};

        assertEquals(printArray(expected), printArray(LeftRotation.rotLeftV1(a, 4)));

        assertEquals(printArray(expected), printArray(LeftRotation.rotLeftV2(a, 4)));

        assertEquals(printArray(expected), printArray(LeftRotation.rotLeftV3(a, 4)));
    }
}