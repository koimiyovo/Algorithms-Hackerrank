package com.kyovo.practice.problemsolving;

public class PrimeFactor {
    public static String find(int n) {
        StringBuilder output = new StringBuilder();
        while (n % 2 == 0) {
            output.append("2 ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n) ; i+=2) {
            while (n % i == 0) {
                output.append(i).append(" ");
                n /= i;
            }
        }

        if (n > 2) {
            output.append(n).append(" ");
        }

        return output.toString();
    }

    public static String find2(int n) {
        StringBuilder output = new StringBuilder();
        int remainder = n;
        int divisor = 2;
        while (remainder > 1) {
            while (remainder % divisor == 0) {
                output.append(divisor).append(" ");
                remainder /= divisor;
            }
            divisor++;
        }
        return output.toString();
    }
}
