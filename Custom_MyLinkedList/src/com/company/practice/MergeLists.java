package com.company.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

    public static List<Integer> mergeLists(List<Integer> list1,List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }
}
