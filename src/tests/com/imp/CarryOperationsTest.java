package com.imp;

import com.imp.CompanyInterview.Toptal.CarryOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CarryOperationsTest {
    @Test
    void countCarry() {
        CarryOperations sample = new CarryOperations();
        int a = 9555;
        int b = 555;
        int actualResult = sample.countCarry(a, b);
        int expectedResultCount = 4;
        Assert.assertEquals(expectedResultCount, actualResult);
    }

}