package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.arrayds;

import org.junit.jupiter.api.Test;

import static com.kyovo.utils.Utils.printArray;
import static org.junit.jupiter.api.Assertions.*;

class ArrayDSTest {

    @Test
    void reverseArrayV2() {
        int[] expected1 = {5, 4, 3, 2, 1};
        int[] expected2 = {4, 3, 2, 1};
        assertEquals(printArray(expected1), printArray(ArrayDS.reverseArrayV2(new int[]{1, 2, 3, 4, 5})));
        assertEquals(printArray(expected2), printArray(ArrayDS.reverseArrayV2(new int[]{1, 2, 3, 4})));
    }
}