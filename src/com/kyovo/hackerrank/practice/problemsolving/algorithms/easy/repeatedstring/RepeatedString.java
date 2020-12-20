package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.repeatedstring;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        int strLength = s.length();
        long totalTimesCompleteStringIsRepeated = n / strLength;
        long remainderSubstringLength = n % strLength;

        long countAInInitialString = countLetterAInString(s, strLength);
        long countAInRemainderSubstring = countLetterAInString(s, remainderSubstringLength);

        return (totalTimesCompleteStringIsRepeated * countAInInitialString) + countAInRemainderSubstring;
    }

    private static long countLetterAInString(String text, long stringLength) {
        long count = 0;
        for (int i = 0; i < stringLength; i++) {
            if (text.charAt(i) == 'a')
                count++;
        }
        return count;
    }

    public static String buildStringToConsider(String initialString, long nbCharacters) {
        StringBuilder stringToConsider = new StringBuilder();
        int initialStringLength = initialString.length();
        for (int i = 0; i < nbCharacters; i++) {
            int position = i % initialStringLength;
            stringToConsider.append(initialString.charAt(position));
        }
        return stringToConsider.toString();
    }
}
