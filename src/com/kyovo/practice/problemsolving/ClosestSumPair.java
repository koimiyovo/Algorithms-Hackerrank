package com.kyovo.practice.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestSumPair {
    /*
     * Given two integer arrays and a target, find the pair of integer that
     * their sum is the closest to the target.
     * e.g: int[] b1 = {7, 4, 1, 10};
            int[] b2 = {4, 5, 8, 7};
            int bTarget = 13;
            closestSumPair(b1, b2, bTarget) should return {4, 8}, {7, 7}, {7, 5}, or {10, 4}
     */
    public static int[] closestSumPair(int[] array1, int[] array2, int target) {
        int[] array1Sorted = copyAndSortArray(array1);
        int[] array2Sorted = copyAndSortArray(array2);

        int startIndex = 0, endIndex = array2Sorted.length-1;
        int minDiff = Math.abs(array1Sorted[startIndex] + array2Sorted[startIndex] - target);
        int[] closestPair = {array1Sorted[0], array2Sorted[0]};

        while (startIndex < array1Sorted.length && endIndex >= 0) {
            int value1 = array1Sorted[startIndex];
            int value2 = array2Sorted[endIndex];
            int currentDiff = value1 + value2 - target;

            if (Math.abs(currentDiff) < minDiff) {
                minDiff = Math.abs(currentDiff);
                closestPair[0] = value1;
                closestPair[1] = value2;
            }

            if (currentDiff == 0) {
                return closestPair;
            } else if (currentDiff < 0) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return closestPair;
    }

    public static List<int[]> listOfClosestSumPairs(int[] array1, int[] array2, int target) {
        List<int[]> pairs = new ArrayList<>();
        int[] array1Sorted = copyAndSortArray(array1);
        int[] array2Sorted = copyAndSortArray(array2);

        int startIndex = 0, endIndex = array2Sorted.length-1;
        int minDiff = Math.abs(array1Sorted[startIndex] + array2Sorted[startIndex] - target);
        int[] closestPair = {array1Sorted[0], array2Sorted[0]};

        while (startIndex < array1Sorted.length && endIndex >= 0) {
            int value1 = array1Sorted[startIndex];
            int value2 = array2Sorted[endIndex];
            int currentDiff = value1 + value2 - target;

            if (Math.abs(currentDiff) < minDiff) {
                minDiff = Math.abs(currentDiff);
                closestPair[0] = value1;
                closestPair[1] = value2;
            }

            if (currentDiff == 0) {
                pairs.add(closestPair);
            } else if (currentDiff < 0) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return pairs;
    }

    private static int[] copyAndSortArray(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        return copy;
    }
}
