package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.countingvalleys;

public class CountingValleys {
    public static int count(int steps, String path)
    {
        int nbValleys = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++) {
            char currentChar = path.charAt(i);
            if (goUp(currentChar)) {
                seaLevel++;
                if (seaLevel == 0) {
                    nbValleys++;
                }
            } else if (goDown(currentChar)) {
                seaLevel--;
            }
        }
        return nbValleys;
    }

    private static boolean goDown(char c) {
        return c == 'D';
    }

    private static boolean goUp(char c) {
        return c == 'U';
    }
}
