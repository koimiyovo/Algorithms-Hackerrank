package com.kyovo.practice.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kyovo.utils.Utils.printList;
import static org.junit.jupiter.api.Assertions.*;

import static com.kyovo.utils.Utils.printArray;

class ClosestSumPairTest {

    @Test
    void closestSumPair() {
        int[] expected = {4, 8};
        int[] array1 = {7, 4, 1, 10};
        int[] array2 = {4, 5, 8, 7};
        int target = 13;
        assertEquals(printArray(expected), printArray(ClosestSumPair.closestSumPair(array1, array2, target)));
    }
}