package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeListsTest {

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

        Integer[] expected = {1,2,3,5,2,2,8,5};
        Assertions.assertArrayEquals(expected,MergeLists.mergeLists(list1,list2).toArray());
    }

}