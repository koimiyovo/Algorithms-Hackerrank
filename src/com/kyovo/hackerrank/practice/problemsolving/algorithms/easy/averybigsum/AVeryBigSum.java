package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.averybigsum;

public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
