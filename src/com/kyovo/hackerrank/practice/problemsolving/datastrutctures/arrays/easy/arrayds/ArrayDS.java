package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.arrayds;

public class ArrayDS {
    public static int[] reverseArrayV1(int[] a) {
        int[] reversed = new int[a.length];
        for (int i = a.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = a[i];
        }
        return reversed;
    }

    public static int[] reverseArrayV2(int[] a) {
        int endIndex = a.length-1;
        for (int startIndex = 0; startIndex <= endIndex/2 ; startIndex++) {
            swap(a, startIndex, endIndex-startIndex);
        }
        return a;
    }

    private static void swap(int[] a, int startIndex, int endIndex) {
        int temp = a[startIndex];
        a[startIndex] = a[endIndex];
        a[endIndex] = temp;
    }
}
