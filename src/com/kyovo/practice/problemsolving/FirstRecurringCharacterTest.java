package com.kyovo.practice.problemsolving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstRecurringCharacterTest {

    @Test
    void find() {
        assertEquals("A", FirstRecurringCharacter.find("AZUGIOPMLAGUI"));
    }
}