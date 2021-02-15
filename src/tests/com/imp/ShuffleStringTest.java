package com.imp;

import com.imp.String.ShuffleString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

    @Test
    void restoreString() {
        ShuffleString MySample = new ShuffleString();
        String s="codeleet";
        int[] indecies = {4,5,6,7,0,1,2,3};
        String expectedResult = "leetcode";
        String acualResult = MySample.restoreString(s,indecies);
        assertEquals(expectedResult, acualResult);

    }
}