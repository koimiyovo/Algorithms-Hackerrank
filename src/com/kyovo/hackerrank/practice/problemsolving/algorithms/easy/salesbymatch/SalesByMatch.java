package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.salesbymatch;

import java.util.HashSet;

public class SalesByMatch {
    public static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            int item = ar[i];
            if (!colors.contains(item)) {
                colors.add(item);
            } else {
                pairs++;
                colors.remove(item);
            }
        }
        return pairs;
    }
}
