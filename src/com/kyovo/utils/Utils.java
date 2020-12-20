package com.kyovo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {
    public static String printArray(int[] array) {
        return "[" +
                Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")) +
                "]";
    }

    public static String printArray(String[] array) {
        return "[" +
                String.join(",", array) +
                "]";
    }

    public static String printList(List<Integer> list) {
        return "[" +
                list.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(",")) +
                "]";
    }
}
