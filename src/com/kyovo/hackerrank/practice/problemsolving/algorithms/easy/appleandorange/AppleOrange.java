package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.appleandorange;

public class AppleOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        System.out.println(count(s, t, a, apples));
        System.out.println(count(s, t, b, oranges));
    }

    static int count(int start, int end, int treePosition, int[] fruitPositions) {
        int count = 0;
        for (int fallPosition : fruitPositions) {
            int finalPosition = treePosition + fallPosition;
            if (start <= finalPosition && finalPosition <= end) {
                count++;
            }
        }
        return count;
    }
}
