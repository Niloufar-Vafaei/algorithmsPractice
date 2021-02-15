package com.imp;

import com.imp.String.ToLowerCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseTest {

    @Test
    void toLowerCase() {
        ToLowerCase mySample=new ToLowerCase();
        String str="Hello&";
        String expectedResult = "hello&";
        String acualResult = mySample.toLowerCase(str);
        assertEquals(expectedResult, acualResult);
    }
}