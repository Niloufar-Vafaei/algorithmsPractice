package com.imp;

import com.imp.Numbers.SubtractProductSumDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractProductSumDigitsTest {

    @Test
    void subtractProductAndSum() {
        SubtractProductSumDigits MySample = new SubtractProductSumDigits();
        int nums = 234;
        int expectedResult = 15;
        int acualResult = MySample.subtractProductAndSum(nums);
        assertEquals(expectedResult, acualResult);
    }
}