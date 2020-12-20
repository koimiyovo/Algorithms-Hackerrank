package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.gradingstudents;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (Integer grade : grades) {
            roundedGrades.add(roundGrade(grade));
        }
        return roundedGrades;
    }

    private static int roundGrade(int grade) {
        int result = grade;
        if (result >= 38 && findNextMultipleOf5(grade) - grade < 3) {
            result = findNextMultipleOf5(grade);
        }
        return result;
    }

    private static int findNextMultipleOf5(int n) {
        int result = n+1;
        while (result % 5 != 0) {
            result++;
        }
        return result;
    }
}
