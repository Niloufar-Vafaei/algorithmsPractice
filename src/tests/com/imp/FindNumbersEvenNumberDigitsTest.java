package com.imp;

import com.imp.Numbers.FindNumbersEvenNumberDigits;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

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