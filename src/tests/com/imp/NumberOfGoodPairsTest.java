package com.imp;

import com.imp.HashTable.NumberOfGoodPairs;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NumberOfGoodPairsTest {

    @Test
    void numIdenticalPairs() {
       NumberOfGoodPairs MySample = new NumberOfGoodPairs() ;
        int[] nums = {1,1,1,1};
        int acualResult = MySample.numIdenticalPairs(nums);
        int expectedResult =6;
        Assert.assertEquals(expectedResult, acualResult);
    }
}