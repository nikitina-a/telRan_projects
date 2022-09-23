package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    void testTask3() {
        List<Integer> list1 =new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 =new ArrayList<>();
        list2.add(2);
        list2.add(2);
        list2.add(8);
        list2.add(5);

        String[] expected = {"No","Yes","No","Yes"};
        Assertions.assertArrayEquals(expected,Task3.compareElements(list1,list2).toArray());
    }

}