package com.imp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStones() {
        JewelsAndStones mySample=new JewelsAndStones();
        String J="aA";
        String S="asdfAedfAAa";
        int expectedResult =5 ;
        int acualResult = mySample.numJewelsInStones(J, S);
        assertEquals(expectedResult, acualResult);

    }
}