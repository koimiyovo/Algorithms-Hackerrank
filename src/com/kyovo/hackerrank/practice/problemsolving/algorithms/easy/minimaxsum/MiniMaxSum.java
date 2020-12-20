package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.minimaxsum;

public class MiniMaxSum {
    public static void miniMaxSum(int[] arr) {
        int length = arr.length;
        long min = arr[0], max = min, sum = min;
        for (int i = 1; i < length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum - min));
    }
}
