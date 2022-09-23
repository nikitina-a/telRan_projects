package com.company.transformers;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransFormStringTest {
    @Test
    void checkIfToUpper() {
        String str = "aaa BB";
        String expected = "AAA BB";
        Assertions.assertEquals(expected, TransFormString.transformString(str,new ToUpperCase()));



    }


    @Test
    void checkIfToLower() {
        String str = "aaa BB";
        String expected = "aaa bb";
        Assertions.assertEquals(expected, TransFormString.transformString(str,new ToLowerCase()));



    }

    @Test
    void checkIfStrIsEmpty() {
        String str = "";
        String expected = "";
        Assertions.assertEquals(expected, TransFormString.transformString(str,new ToLowerCase()));



    }

}