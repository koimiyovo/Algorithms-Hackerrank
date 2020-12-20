package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.medium.sparsearrays;

import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
    public static int[] matchingStrings(String[] strings, String[] queries) {
        int[] matches = new int[queries.length];
        Map<String, Integer> hashMap = new HashMap<>();
        fillMap(strings, hashMap);
        for (int i = 0; i < queries.length; i++) {
            if (hashMap.containsKey(queries[i])) {
                matches[i] = hashMap.get(queries[i]);
            }
        }
        return matches;
    }

    private static void fillMap(String[] strings, Map<String, Integer> hashMap) {
        for (String s : strings) {
            if (hashMap.containsKey(s)) {
                hashMap.replace(s, hashMap.get(s)+1);
            } else {
                hashMap.put(s, 1);
            }
        }
    }

    private static void printMap(Map<String, Integer> hashMap) {
        for (String s : hashMap.keySet()) {
            System.out.println(s + " : " + hashMap.get(s));
        }
    }
}
