package com.kyovo.practice.problemsolving;

public class LeastCommonMultiple {
    public static int find(int a, int b) {
        return (a*b) / GreatestCommonDivisor.findByRecursion(a, b);
    }
}
