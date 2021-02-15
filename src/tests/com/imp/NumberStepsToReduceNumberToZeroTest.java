package com.imp;

import com.imp.Numbers.NumberStepsToReduceNumberToZero;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

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