package com.imp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arrayTestTest {

    @Test
    void chengeNumber() {
        arrayTest sample=new arrayTest();
        int[] acual={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int []result= sample.chengeNumber(acual);
        int [] expectedresult={1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0};
        assertArrayEquals(expectedresult,result);
    }
}