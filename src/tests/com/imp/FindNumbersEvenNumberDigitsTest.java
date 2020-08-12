package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumbersEvenNumberDigitsTest {

    @Test
    void findNumbers() {
        FindNumbersEvenNumberDigits mySample =new FindNumbersEvenNumberDigits();
        int[] nums={12,345,2,6,7896};
        int acualResult = mySample.findNumbers(nums);
        int expectedResult =2;
        Assert.assertEquals(expectedResult, acualResult);
    }
}