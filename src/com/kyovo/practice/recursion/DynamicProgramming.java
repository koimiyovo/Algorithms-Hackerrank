package com.kyovo.practice.recursion;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgramming {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static int fibMemoization(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else if (n <= 2) {
            return 1;
        } else {
            int result = fibMemoization(n-1) + fibMemoization(n-2);
            memo.put(n, result);
            return result;
        }
    }

    public static int fibBottomUp(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            int[] fibs = new int[n+1];
            fibs[1] = fibs[2] = 1;
            for (int i = 3; i <= n; i++) {
                fibs[i] = fibs[i-1] + fibs[i-2];
            }
            return fibs[n];
        }
    }

    public static int numWaysBottomUp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int[] nums = new int[n+1];
            nums[0] = nums[1] = 1;
            for (int i = 2; i <= n; i++) {
                nums[i] = nums[i-1] + nums[i-2];
            }
            return nums[n];
        }
    }
}
