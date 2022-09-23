package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;
    @BeforeEach
    void init(){
        this.main = new Main();

    }
    @Test
    void checkLongestLengthIsOne() {
        int expected = 1;
        Assertions.assertEquals(1,main.getLongestSec("a"));

    }

    @Test
    void checkLongestLengthIsThree() {
        int expected = 1;
        Assertions.assertEquals(3,main.getLongestSec("abbbc"));

    }

    @Test
    void checkLongestLengthIfEndOfString() {
        int expected = 1;
        Assertions.assertEquals(4,main.getLongestSec("abbbcccc"));

    }

}