package com.company.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    //6. Есть лист целых чисел. Написать метод, возвращающий лист без элементов больше заданного.
public static List<Integer> getNewList(List<Integer> list,int num) {
    return list.stream().filter(el->el<num).collect(Collectors.toList());
}
}
