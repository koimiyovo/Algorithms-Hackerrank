package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.hard.arraymanipulation;

public class ArrayManipulation {
    public static long arrayManipulation(int n, int[][] queries) {
        long[] outputArray = new long[n+2];
        fillArray(queries, outputArray);

        long max = Long.MIN_VALUE;
        long sum = 0;
        for (long l : outputArray) {
            sum += l;
            max = Math.max(max, sum);
        }
        return max;
    }

    private static void fillArray(int[][] queries, long[] outputArray) {
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            outputArray[a] += k;
            outputArray[b+1] -= k;
        }
    }
}
