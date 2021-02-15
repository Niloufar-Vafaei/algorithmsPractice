package com.imp;

import com.imp.String.Reverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        Reverse sample=new Reverse();
        String s="abc";
        String acualResult=sample.reverse(s);
        String exResult="cba";
        assertEquals(exResult, acualResult);
    }
}