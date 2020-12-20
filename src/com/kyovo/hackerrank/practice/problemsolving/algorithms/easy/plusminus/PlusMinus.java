package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.plusminus;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        float nbPositives = 0, nbNegatives = 0, nbZeros = 0;
        int arrLength = arr.length;
        for (int j : arr) {
            if (j < 0) {
                nbNegatives++;
            } else if (j == 0) {
                nbZeros++;
            } else {
                nbPositives++;
            }
        }
        System.out.printf("%.6f%n", nbPositives/arrLength);
        System.out.printf("%.6f%n", nbNegatives/arrLength);
        System.out.printf("%.6f%n", nbZeros/arrLength);
    }
}
