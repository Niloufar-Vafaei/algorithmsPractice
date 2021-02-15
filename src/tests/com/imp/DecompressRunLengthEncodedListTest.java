package com.imp;

import com.imp.ArrayD2.DecompressRunLengthEncodedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DecompressRunLengthEncodedListTest {

    @Test
    void decompressRLElist() {
        DecompressRunLengthEncodedList MySample = new DecompressRunLengthEncodedList();
        int n=3;
        int[] nums = {1,2,3,4};
        int[] expectedResult = {2,4,4,4};
        int[] acualResult = MySample.decompressRLElist(nums);
        Assert.assertArrayEquals(expectedResult, acualResult);
    }
}