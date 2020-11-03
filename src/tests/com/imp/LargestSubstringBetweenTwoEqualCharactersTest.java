package com.imp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSubstringBetweenTwoEqualCharactersTest {

    @Test
    void maxLengthBetweenEqualCharacters() {
    LargestSubstringBetweenTwoEqualCharacters sample =new LargestSubstringBetweenTwoEqualCharacters();
    //String s="scayofdzca";
    String s="abccba";
    int acutalResult=sample.maxLengthBetweenEqualCharacters(s);
    int expectedResult=6;
    assertEquals(expectedResult, acutalResult);
    }
}