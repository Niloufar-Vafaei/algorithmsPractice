package com.imp;

import com.imp.String.DefangingAnIPAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefangingAnIPAddressTest {

    @Test
    void defangIPaddr() {
        DefangingAnIPAddress MySample = new DefangingAnIPAddress();
        String str = "1.1.1.1";
        String expectedResult = "1[.]1[.]1[.]1";
        String acualResult = MySample.defangIPaddr(str);
        assertEquals(expectedResult, acualResult);
    }
}