package com.kyovo.hackerrank.practice.problemsolving.datastrutctures.arrays.easy.dynamicarray;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    private static final List<List<Integer>> seqList = new ArrayList<>();
    private static List<Integer> seq;
    private static int lastAnswer = 0;

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        initializeSequences(n);

        for (List<Integer> query : queries) {
            int queryType = query.get(0);
            int x = query.get(1);
            int y = query.get(2);
            seq = seqList.get((x^lastAnswer)%n);
            if (queryType == 1) {
                appendValue(y);
            } else {
                printValue(y);
                result.add(lastAnswer);
            }
        }
        return result;
    }

    private static void initializeSequences(int numberOfSeq) {
        for (int i = 0; i < numberOfSeq; i++) {
            seqList.add(new ArrayList<>());
        }
    }

    private static void appendValue(int y) {
        seq.add(y);
    }

    private static void printValue(int y) {
        lastAnswer = seq.get(y % seq.size());
        System.out.println(lastAnswer);
    }
}
