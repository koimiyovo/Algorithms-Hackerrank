package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.staircase;

public class StairCase {
    public static void staircaseV1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void staircase(int n) {
        String str = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%"+n+"s\n", str);
            str += "#";
        }
    }
}
