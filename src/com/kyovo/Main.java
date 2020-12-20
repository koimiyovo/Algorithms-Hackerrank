package com.kyovo;

import com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.staircase.StairCase;

import static com.kyovo.utils.Utils.printArray;

public class Main {

    private static final int[] array = new int[] { 10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3 };

    public static void main(String[] args) {
	    //mergeSort();
        //insertionSort();
        //quickSort();
	    //binarySearch();
        //findChoices();
        StairCase.staircase(6);
    }

    private static void mergeSort() {
        System.out.print("Initial array :\t\t\t" + printArray(array));
        Algorithm.mergeSort(array);
        System.out.print("\nMerge Sorted array :\t" + printArray(array));
    }

    private static void insertionSort() {
        System.out.print("Initial array :\t\t\t\t" + printArray(array));
        Algorithm.insertionSort(array);
        System.out.print("\nInsertion Sorted array :\t" + printArray(array));
    }

    private static void quickSort() {
        System.out.print("Initial array :\t\t\t" + printArray(array));
        Algorithm.quickSort(array);
        System.out.print("\nQuick Sorted array :\t" + printArray(array));
    }

    private static void binarySearch() {
        int[] array2 = new int[] { 1,2,3,4,5,6,7,8,9,10,11,12 };
        System.out.println("Initial array :\t" + printArray(array2));
        int searchResultFor7 = Algorithm.binarySearch(array2, 7);
        System.out.println("Search for 7 : " + (searchResultFor7 != -1 ? "Found at index " + searchResultFor7 : "Not found"));
        int searchResultFor99 = Algorithm.binarySearch(array2, 99);
        System.out.println("Search for 99 : " + (searchResultFor99 != -1 ? "Found at index " + searchResultFor99 : "Not found"));
    }

    private static void findChoices() {
        int[] menu = new int[] { 2, 7, 13, 5, 4, 13, 5 };
        System.out.println("Menu :\t" + printArray(menu));
        System.out.println("Choices :\t" + printArray(Algorithm.findChoices(menu, 10)));
    }
}
