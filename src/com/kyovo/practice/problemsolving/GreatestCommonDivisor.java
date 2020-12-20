package com.kyovo.practice.problemsolving;

public class GreatestCommonDivisor {
    public static int findByBrutForce(int a, int b) {
        int gcd = 0;
        int min = Math.min(a, b);
        while (min > 0) {
            if (a%min == 0 && b%min == 0) {
                gcd = min;
                break;
            }
            min--;
        }
        return gcd;
    }

    public static int findByRecursion(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a == b) {
            return a;
        } else if (a > b) {
            return findByRecursion(a-b, b);
        } else {
            return findByRecursion(a, b-a);
        }
    }
}
