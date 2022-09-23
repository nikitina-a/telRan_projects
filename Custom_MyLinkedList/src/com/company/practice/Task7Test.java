package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    @Test
    void findShortestStringNormalCase() {
        List<String> stringList = new ArrayList<>();
        stringList.add("hhhh");
        stringList.add("hhhhdsf");
        stringList.add("gre");
        String expected = "gre";
        Assertions.assertEquals(expected,Task7.findShortest(stringList));

    }

    @Test
    void findShortestStringNullCase() {
        List<String> stringList = new ArrayList<>();

        String expected = null;
        Assertions.assertEquals(expected,Task7.findShortest(stringList));

    }

}