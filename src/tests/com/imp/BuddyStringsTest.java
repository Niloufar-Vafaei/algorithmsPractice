package com.imp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class BuddyStringsTest {
    @Test
    void checkBuddyString() {
        BuddyStrings sample = new BuddyStrings();
        String a = "ab";
        String b = "ba";
        boolean actualResult=sample.buddyStrings(a,b);
        assertTrue(actualResult);
    }
}