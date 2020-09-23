package com.imp;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MinimumTimeVisitingAllPointsTest {

    @Test
    void minTimeToVisitAllPoints() {
        MinimumTimeVisitingAllPoints mySample=new MinimumTimeVisitingAllPoints();
        int[][] points={{1,1},{3,4},{-1,0}};
        int acualResult=mySample.minTimeToVisitAllPoints(points);
        int expectedResult=7;
        assertEquals (expectedResult,acualResult);
    }
}