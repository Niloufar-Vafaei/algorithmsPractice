package com.imp;

import com.imp.String.SplitStringBalancedStrings;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

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