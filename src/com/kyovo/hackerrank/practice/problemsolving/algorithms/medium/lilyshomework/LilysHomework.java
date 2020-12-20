package com.kyovo.hackerrank.practice.problemsolving.algorithms.medium.lilyshomework;

import java.util.TreeMap;

public class LilysHomework {
    public static int lilysHomework(int[] array) {
        TreeMap<Integer, Integer> forwardMap = new TreeMap<>();
        TreeMap<Integer, Integer> backwardMap = new TreeMap<>();
        int[] backwardArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            forwardMap.put(array[i], i);
            backwardMap.put(array[i], i);
            backwardArray[i] = array[i];
        }

        int index = 0;
        int numOfSwapsForward = 0;
        while (index < array.length) {
            int smallestNum = forwardMap.firstKey();
            if (array[index] != smallestNum) {
                int targetIndex = forwardMap.get(smallestNum);
                int temp = array[index];
                array[index] = smallestNum;
                array[targetIndex] = temp;

                forwardMap.put(array[targetIndex], targetIndex);
                numOfSwapsForward++;
            }
            index++;
            forwardMap.remove(smallestNum);
        }

        index = array.length-1;
        int numOfSwapsBackward = 0;
        while (index >= 0) {
            int smallestNum = backwardMap.firstKey();
            if (backwardArray[index] != smallestNum) {
                int targetIndex = backwardMap.get(smallestNum);
                int temp = backwardArray[index];
                backwardArray[index] = smallestNum;
                backwardArray[targetIndex] = temp;

                backwardMap.put(backwardArray[targetIndex], targetIndex);
                numOfSwapsBackward++;
            }
            index--;
            backwardMap.remove(smallestNum);
        }

        return Math.min(numOfSwapsForward, numOfSwapsBackward);
    }
}
