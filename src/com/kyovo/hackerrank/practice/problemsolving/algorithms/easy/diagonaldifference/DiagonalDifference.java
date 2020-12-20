package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.diagonaldifference;

import java.util.List;

public class DiagonalDifference {
    /**
     * x x x x
     * x x x x
     * x x x x
     * x x x x
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstSum = 0, secondSum = 0, size = arr.size();
        for (int i = 0; i < size; i++) {
            firstSum += arr.get(i).get(i);
            secondSum += arr.get(i).get(size-i-1);
        }
        return Math.abs(firstSum-secondSum);
    }
}
