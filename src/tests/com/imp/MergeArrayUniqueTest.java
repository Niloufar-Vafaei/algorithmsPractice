package com.imp;

import com.imp.Numbers.MergeArrayUnique;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


class MergeArrayUniqueTest  {

    @Test
    void mergeArray() throws Exception {
        MergeArrayUnique MySample =new MergeArrayUnique();
        List<Integer> sampleOne=new ArrayList<Integer>();
        List<Integer> sampleTwo=new ArrayList<Integer>();
        List<Integer> expectedResult=new ArrayList<Integer>();
        sampleOne.add(1);
        sampleOne.add(3);
        sampleTwo.add(1);
        sampleTwo.add(15);
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(15);

        // assert statements
        assertEquals (expectedResult,MySample.mergeArray(sampleOne,sampleTwo));
        System.out.println("test pass");
    }

}