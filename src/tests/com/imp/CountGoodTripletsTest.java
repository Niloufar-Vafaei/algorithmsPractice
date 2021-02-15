package com.imp;

import com.imp.Numbers.CountGoodTriplets;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CountGoodTripletsTest {

    @Test
    void countGoodTriplets() {
       CountGoodTriplets MySample = new CountGoodTriplets() ;
        int[] nums = {3,0,1,1,9,7};
        int a = 7;
        int b = 2;
        int c = 3;
        int acualResult = MySample.countGoodTriplets(nums,a,b,c);
        int expectedResult =4;
        Assert.assertEquals(expectedResult, acualResult);
    }
}