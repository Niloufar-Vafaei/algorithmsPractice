package com.imp;

import com.imp.Numbers.NumbersAreSmallerThanCurrentNumber;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NumbersAreSmallerThanCurrentNumberTest {

    @Test
    void smallerNumbersThanCurrent() {
        NumbersAreSmallerThanCurrentNumber MySample = new NumbersAreSmallerThanCurrentNumber();
        int[] nums = {8, 1, 2, 2, 3};
        int[] expectedResult = {4, 0, 1, 1, 3};
        int[] acualResult = MySample.smallerNumbersThanCurrent(nums);
        Assert.assertArrayEquals(expectedResult, acualResult);

    }
}