package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.medium.sparsearrays;

import org.junit.jupiter.api.Test;

import static com.kyovo.utils.Utils.printArray;
import static org.junit.jupiter.api.Assertions.*;

class SparseArraysTest {

    @Test
    void matchingStrings() {
        assertEquals(printArray(new int[]{2, 1, 0}), printArray(SparseArrays.matchingStrings(new String[]{"ab", "ab", "abc"}, new String[]{"ab", "abc", "bc"})));
    }
}