package com.imp;

import com.imp.String.AlternatingCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class AlternatingCharactersTest {

    @Test
    void numberDeletion() {
        AlternatingCharacters sample=new AlternatingCharacters();
        String input ="BABABABA";
        int actualResult= sample.numberDeletion(input);
        int expectedResult=0;
        assertEquals(expectedResult, actualResult);

    }
}