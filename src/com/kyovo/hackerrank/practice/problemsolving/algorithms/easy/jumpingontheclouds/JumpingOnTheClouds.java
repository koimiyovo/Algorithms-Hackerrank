package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.jumpingontheclouds;

public class JumpingOnTheClouds {
    public static int jumpV1(int[] c) {
        int jumps = -1;
        int length = c.length;
        for (int i = 0; i < length;) {
            if (i+2 < length && c[i+2] == 0) {
                i +=2;
            } else {
                i++;
            }
            jumps++;
        }
        return jumps;
    }

    public static int jumpV2(int[] c) {
        int jumps = -1;
        int length = c.length;
        for (int i = 0; i < length;) {
            if (i+2 < length && c[i+2] == 0) {
                i++;
            }
            i++;
            jumps++;
        }
        return jumps;
    }

    public static int jump(int[] c) {
        int jumps = -1;
        int length = c.length;
        for (int i = 0; i < length; i++, jumps++) {
            if (i+2 < length && c[i+2] == 0) {
                i++;
            }
        }
        return jumps;
    }
}
