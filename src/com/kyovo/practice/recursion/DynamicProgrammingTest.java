package com.kyovo.practice.recursion;

import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProgrammingTest {

    @Test
    void fibMemoization() {
        assertEquals(2, DynamicProgramming.fibMemoization(3));
    }
}