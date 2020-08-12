package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringBalancedStringsTest {

    @Test
    void balancedStringSplit() {
        SplitStringBalancedStrings MySample = new SplitStringBalancedStrings() ;
        String s = "RLRRLLRLRL";
        int acualResult = MySample.balancedStringSplit(s);
        int expectedResult =4;
        Assert.assertEquals(expectedResult, acualResult);
    }
}