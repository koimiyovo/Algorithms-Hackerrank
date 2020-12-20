package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.simplearraysum;

public class SimpleArraySum {
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int j : ar) {
            sum += j;
        }
        return sum;
    }
}
