package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void reverseTest() {
        List<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        Integer[] expected = {5,3,2,1};
        Assertions.assertArrayEquals(expected,Reverse.reverse(list1).toArray());

    }

    @Test
    void reverseTestIfNull() {
        List<Integer> list1 =new ArrayList<>();

        Integer[] expected = {};
        Assertions.assertArrayEquals(expected,Reverse.reverse(list1).toArray());

    }

}