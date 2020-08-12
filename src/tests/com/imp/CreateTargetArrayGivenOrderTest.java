package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CreateTargetArrayGivenOrderTest {

    @Test
    void createTargetArray() {
        CreateTargetArrayGivenOrder MySample = new CreateTargetArrayGivenOrder();
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] acualResult = MySample.createTargetArray(nums, index);
        int[] expectedResult = {0, 4, 1, 3, 2};
        Assert.assertArrayEquals(expectedResult, acualResult);
    }
}