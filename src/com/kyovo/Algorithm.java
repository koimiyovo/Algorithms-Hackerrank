package com.kyovo;

import java.util.*;
import java.util.stream.Collectors;

public final class Algorithm {
    private Algorithm() {}

    // Merge sort
    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length-1);
    }

    private static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int middle = (leftStart + rightEnd) / 2;
            mergeSort(array, temp, leftStart, middle);
            mergeSort(array, temp, middle+1, rightEnd);
            mergeHalves(array, temp, leftStart, rightEnd);
        }
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    // Insertion sort
    public static void insertionSort(int[] array) {
        int valueToInsert, indexToInsertIn;
        for (int i = 0; i < array.length; i++) {
            valueToInsert = array[i];
            indexToInsertIn = i;

            while (indexToInsertIn > 0 && array[indexToInsertIn-1] > valueToInsert) {
                array[indexToInsertIn] = array[indexToInsertIn-1];
                indexToInsertIn--;
            }

            if (indexToInsertIn != i) {
                array[indexToInsertIn] = valueToInsert;
            }
        }
    }

    // Quick sort
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index-1);
        quickSort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] array, int value1, int value2) {
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
    }

    // Given a String array, find the longest item
    // And make other items match the same length by adding 'z' at their end
    public static String[] completeStringsWith(String[] array, char c) {
        String[] completedArray = array.clone();
        String longestString = findLongestString(array);
        int maxLength = longestString.length();

        for (int i = 0; i < completedArray.length; i++) {
            if (completedArray[i].length() != maxLength) {
                int complement = maxLength - completedArray[i].length();
                for (int j = 0; j < complement; j++) {
                    completedArray[i] += c;
                }
            }
        }

        return completedArray;
    }

    public static String findLongestString(String[] array) {
        String longestItem = "";
        for (String s : array) {
            if (s.length() > longestItem.length()) {
                longestItem = s;
            }
        }
        return longestItem;
    }

    // Binary search
    public static int binarySearch(int[] array, int value) {
        return binarySearchIterative(array, value, 0, array.length-1);
    }

    private static int binarySearchIterative(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        } else {
            int mid = left + ( (right-left) / 2 );
            if (value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                return binarySearchIterative(array, value, left, mid-1);
            } else {
                return binarySearchIterative(array, value, mid+1, right);
            }
        }
    }

    private static int binarySearchIterative(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        while (left <= right) {
            int mid = left + ( (right-left) / 2 );
            if (value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    // Ice cream parlor
    // Find the indices of two items on the menu that allow us to spend all our money
    public static int[] findChoices(int[] menu, int money) {
        int[] sortedMenu = menu.clone();
        Arrays.sort(sortedMenu);

        for (int i = 0; i < sortedMenu.length; i++) {
            int complement = money - sortedMenu[i];
            int location = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.length, complement);
            if (location >= 0 && location < sortedMenu.length && sortedMenu[location] == complement) {
                return getIndicesFromValues(menu, sortedMenu[i], complement);
            }
        }

        return null;
    }

    private static int[] getIndicesFromValues(int[] array, int value1, int value2) {
        int index1 = indexOf(array, value1, -1);
        int index2 = indexOf(array, value2, index1);
        return new int[]{ Math.min(index1, index2), Math.max(index1, index2) };
    }

    private static int indexOf(int[] array, int value, int excludeIndex) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value && i != excludeIndex) {
                return i;
            }
        }
        return -1;
    }
}
