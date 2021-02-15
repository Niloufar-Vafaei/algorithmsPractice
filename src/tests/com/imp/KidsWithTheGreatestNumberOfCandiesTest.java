package com.imp;

import com.imp.BST.KidsWithTheGreatestNumberOfCandies;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void kidsWithCandies() {
        KidsWithTheGreatestNumberOfCandies MySample = new KidsWithTheGreatestNumberOfCandies();
        int[] nums = {4, 2, 1};
        int exCandies = 1;
        List<Boolean> expectedResult = new ArrayList<>();
        expectedResult.add(true);
        expectedResult.add(false);
        expectedResult.add(false);

        List<Boolean> acualResult = MySample.kidsWithCandies(nums, exCandies);
        Assert.assertEquals(expectedResult, acualResult);


    }
}