package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    @Test
    void testListIndex() {
        List<Integer> list = List.of(3,2,1,0,5);
        Assertions.assertEquals(2,Main.findIndex(list));
    }
    @Test
    void testListIndexAnotherList() {
        List<Integer> list = List.of(3,2,1,4,5,1,0);
        Assertions.assertEquals(3,Main.findIndex(list));
    }
    @Test
    void testListIndexNotFound() {
        List<Integer> list = List.of(3,2,1,4,5,9,0);
        Assertions.assertEquals(-1,Main.findIndex(list));
    }


}