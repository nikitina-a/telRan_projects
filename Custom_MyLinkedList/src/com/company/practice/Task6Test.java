package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void testTask6() {
        List<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        int num = 3;

        Integer[] expected = {1,2};
        Assertions.assertArrayEquals(expected,Task6.getNewList(list1,num).toArray());
    }

}