package com.kyovo.practice.prefixsum;

import java.util.Arrays;

public class PrefixSum {
    public static int[] prefixSum(int[] array) {
        int[] output = Arrays.copyOf(array, array.length);
        for (int i = 1; i < output.length; i++) {
            output[i] += output[i-1];
        }
        return output;
    }

    public static int rangeSum(int[] array, int start, int end) {
        if (start == 0) {
            return rangeSum(array, end);
        } else {
            return rangeSum(array, end) - rangeSum(array, start-1);
        }
    }

    public static int rangeSum(int[] array, int end) {
        return prefixSum(array)[end];
    }
}
