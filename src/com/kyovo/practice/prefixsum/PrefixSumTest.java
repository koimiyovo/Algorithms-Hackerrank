package com.kyovo.practice.prefixsum;

import org.junit.jupiter.api.Test;

import static com.kyovo.utils.Utils.printArray;
import static org.junit.jupiter.api.Assertions.*;

class PrefixSumTest {

    @Test
    void prefixSum() {
        assertEquals(printArray(new int[]{6, 9, 7, 11, 10, 10, 5}),
                printArray(PrefixSum.prefixSum(new int[]{6, 3, -2, 4, -1, 0, -5})));
    }

    @Test
    void rangeSum() {
        int[] array = new int[]{6, 3, -2, 4, -1, 0, -5};
        assertEquals(10, PrefixSum.rangeSum(array, 0, 4));
    }
}