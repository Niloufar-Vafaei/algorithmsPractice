package com.imp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void shuffle() {
        ShuffleTheArray MySample = new ShuffleTheArray();
        int n=3;
        int[] nums = {2,5,1,3,4,7};
        int[] expectedResult = {2,3,5,4,1,7};
        int[] acualResult = MySample.shuffle(nums,n);
        Assert.assertArrayEquals(expectedResult, acualResult);
    }
}