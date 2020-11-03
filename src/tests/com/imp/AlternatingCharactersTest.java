package com.imp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingCharactersTest {

    @Test
    void numberDeletion() {
        AlternatingCharacters sample=new AlternatingCharacters();
        String input ="BABABABA";
        int acualResult= sample.numberDeletion(input);
        int expectedResult=0;
        assertEquals(expectedResult, acualResult);

    }
}