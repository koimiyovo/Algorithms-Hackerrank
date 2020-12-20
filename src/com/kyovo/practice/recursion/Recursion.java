package com.kyovo.practice.recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }

    public static int fib(int n) {
        if (n >= 3) {
            return fib(n-1) + fib(n-2);
        } else {
            return 1;
        }
    }

    public static List<Integer> fibSequences(int n) {
        List<Integer> sequences = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sequences.add(fib(i));
        }
        return sequences;
    }

    // Recursive staircase problem
    public static int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return numWays(n-1) + numWays(n-2);
        }
    }

    public static int numWaysX(int numberOfCases, int[] steps) {
        if (numberOfCases == 0 || numberOfCases == 1) {
            return 1;
        } else {
            int total = 0;
            for (int step : steps) {
                if (numberOfCases-step >= 0) {
                    total += numWays(numberOfCases-step);
                }
            }
            return total;
        }
    }

    // Multiply a by b using addition
    public static int multiply(int number, int by) {
        if (by == 1) {
            return number;
        } else {
            return multiply(number, by-1);
        }
    }

    // Tower of hanoi
    public static void printMove(String from, String to) {
        System.out.println("Move from " + from + " to " + to);
    }

    public static void move(int nbDisc, String from, String to, String spare) {
        if (nbDisc == 1) {
            printMove(from, to);
        } else {
            move(nbDisc-1, from, spare, to);
            move(1, from, to, spare);
            move(nbDisc-1, spare, to, from);
        }
    }

    // Palindrome
    public static String toChars(String s) {
        s = s.toLowerCase();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                output.append(s.charAt(i));
            }
        }
        return output.toString();
    }

    public static boolean isPalindrome(String s) {
        s = toChars(s);
        if (s.length() <= 1) {
            return true;
        } else {
            //int strLength = s.length();
            //return s.charAt(0) == s.charAt(strLength-1) && isPalindrome(s.substring(1, strLength-1));
            return isPalindromeRecursive(s, 0, s.length()-1);
        }
    }

    public static boolean isPalindromeRecursive(String s, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return true;
        } else if (startIndex > endIndex || s.charAt(startIndex) != s.charAt(endIndex)) {
            return false;
        } else {
            return isPalindromeRecursive(s, startIndex+1, endIndex-1);
        }
    }
}
