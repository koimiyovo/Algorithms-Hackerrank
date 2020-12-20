package com.kyovo.hackerrank.practice.thirtydaysofcode.binarynumbers;

public class BinaryNumber {
    public static String toBinary(int n) {
        StringBuilder output = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            n /= 2;
            output.append(remainder);
        }
        return output.reverse().toString();
    }

    public static int findMaxNumberOfConsecutiveOnes(String s) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

    public static int findMaxNumberOfConsecutiveOnes(int n) {
        int max = 0;
        int count = 0;
        while(n > 0)
        {
            int remainder = n % 2;
            n = n/2;

            if (remainder == 1) {
                count++;
                if(count > max)
                    max = count;
            }
            else {
                count = 0;
            }
        }
        return max;
    }
}
