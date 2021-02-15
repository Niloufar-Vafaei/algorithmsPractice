package com.imp;

import com.imp.Numbers.Maximum69Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {

    @Test
    void maximum69Number() {
        Maximum69Number sample=new Maximum69Number();
        int input =9669;
        int acualResult= sample.maximum69Number(input);
        int expectedResult=9969;
        assertEquals(expectedResult, acualResult);
    }
}