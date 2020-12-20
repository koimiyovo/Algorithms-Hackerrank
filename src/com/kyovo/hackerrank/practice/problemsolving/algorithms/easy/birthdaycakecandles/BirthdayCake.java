package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.birthdaycakecandles;

import java.util.List;

public class BirthdayCake {
    public static int birthdayCakeCandlesV1(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;

        for (int i = 1; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
            }
        }

        int finalMax = max;
        count = (int) candles.stream().filter(c -> c == finalMax).count();

        return count;
    }

    public static int birthdayCakeCandles(List<Integer> candleHeights) {
        int maxHeight = Integer.MIN_VALUE;
        int count = 0;

        for (int height : candleHeights) {
            if (height == maxHeight) {
                count++;
            }

            if (height > maxHeight) {
                maxHeight = height;
                count = 1;
            }
        }

        return count;
    }
}
