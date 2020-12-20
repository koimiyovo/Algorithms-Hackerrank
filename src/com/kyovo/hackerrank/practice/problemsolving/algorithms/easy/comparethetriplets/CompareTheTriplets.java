package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.comparethetriplets;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0, bobPoints = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (b.get(i) > a.get(i)) {
                bobPoints++;
            }
        }
        ArrayList<Integer> comparisonPoints = new ArrayList<Integer>();
        comparisonPoints.add(alicePoints);
        comparisonPoints.add(bobPoints);
        return comparisonPoints;
    }
}
