package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.drawingbook;

public class DrawingBook {
    public static int pageCount(int nbPages, int search) {
        int totalPageTurnCountFromFront = nbPages / 2;
        int targetPageTurnCountFromFront = search / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }
}
