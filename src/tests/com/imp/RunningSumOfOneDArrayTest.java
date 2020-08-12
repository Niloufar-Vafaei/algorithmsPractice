package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RunningSumOfOneDArrayTest {
    // @ParameterizedTest
    //@ValueSource(ints = {{1, 2, 3, 4},{1, 2, 3, 4,}})
    @Test
    void runningSum() throws Exception {
        RunningSumOfOneDArray MySample = new RunningSumOfOneDArray();
        int[] nums = {1, 2, 3, 4};
        int[] expectedResult = {1, 3, 6, 10};
        int[] acualResult = MySample.runningSum(nums);
        Assert.assertArrayEquals(expectedResult, acualResult);
    }

}

