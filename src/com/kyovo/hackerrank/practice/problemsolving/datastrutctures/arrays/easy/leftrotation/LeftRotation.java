package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.leftrotation;

import java.util.Arrays;

public class LeftRotation {
    public static int[] rotLeftV1(int[] a, int d) {
        int[] rotatedArray = Arrays.copyOf(a, a.length);
        for (int i = 0; i < d; i++) {
            rotLeftRecursive(rotatedArray);
        }
        return rotatedArray;
    }

    private static void rotLeftRecursive(int[] a) {
        int item = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length-1] = item;
    }

    public static int[] rotLeftV2(int[] a, int d) {
        int size = a.length;
        int[] rotatedArray = new int[size];

        int i = 0;
        int rotateIndex = d;

        while (rotateIndex < size) {
            rotatedArray[i] = a[rotateIndex];
            i++;
            rotateIndex++;
        }

        rotateIndex = 0;
        while (rotateIndex < d) {
            rotatedArray[i] = a[rotateIndex];
            i++;
            rotateIndex++;
        }

        return rotatedArray;
    }

    public static int[] rotLeftV3(int[] a, int d) {
        int size = a.length;
        int[] rotatedArray = new int[size];

        for (int oldIndex = 0; oldIndex < size; oldIndex++) {
            int newIndex = (oldIndex + size - d) % size;
            rotatedArray[newIndex] = a[oldIndex];
        }
        return rotatedArray;
    }
}
