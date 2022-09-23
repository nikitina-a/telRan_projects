package com.company.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
    //4.Написать метод, реверсирующий лист целых чисел. возвращает его в обратном порядке. Можно решать любым
// способом, какой вам нравится.

    public static List<Integer> reverse(List<Integer> integerList) {
        if (integerList.isEmpty()) return new ArrayList<>();
        List<Integer> reversed = new ArrayList<>();
        ListIterator iterator = integerList.listIterator(integerList.size());
        while (iterator.hasPrevious()) {
            reversed.add((Integer) iterator.previous());
        }
        return reversed;
    }
}
