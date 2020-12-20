package com.kyovo.practice.problemsolving;

import java.util.HashSet;

public class FirstRecurringCharacter {
    public static String find(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.charAt(i))) {
                return Character.toString(s.charAt(i));
            } else {
                hs.add(s.charAt(i));
            }
        }
        return null;
    }
}
