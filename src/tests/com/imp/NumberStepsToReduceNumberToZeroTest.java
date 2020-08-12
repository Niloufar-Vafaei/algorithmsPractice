package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStepsToReduceNumberToZeroTest {

    @Test
    void numberOfSteps() {
      NumberStepsToReduceNumberToZero MySample = new NumberStepsToReduceNumberToZero() ;
        int nums = 14;
        int acualResult = MySample.numberOfSteps(nums);
        int expectedResult =6;
        Assert.assertEquals(expectedResult, acualResult);
    }
}