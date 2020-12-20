package com.kyovo.hackerrank.practice.problemsolving.algorithms.easy.drawingbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingBookTest {
    @Test
    void given5_5ShouldReturn0() {
        assertEquals(0, DrawingBook.pageCount(5, 5));
    }

    @Test
    void given5_4ShouldReturn0() {
        assertEquals(0, DrawingBook.pageCount(5, 4));
    }

    @Test
    void given5_3ShouldReturn1() {
        assertEquals(1, DrawingBook.pageCount(5, 3));
    }

    @Test
    void given6_2ShouldReturn1() {
        assertEquals(1, DrawingBook.pageCount(6, 2));
    }
}