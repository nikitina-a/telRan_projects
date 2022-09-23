package com.company.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    //3.Есть два листа одинковой длины с числами. Написать метод, который вернет лист с элементами Yes or No
//где значение на i-ом месте зависит от того, равны ли элемениы двух спсиков под номером i
// {1,2,3,4} and {5,2,3,0}->{No,Yes,Yes,No}
    public static List<String> compareElements(List<Integer> list1,List<Integer> list2) {
        List<String> ifEquals = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).compareTo(list2.get(i))!=0) {
                ifEquals.add("No");
            } else {
                ifEquals.add("Yes");
            }

        }
        return ifEquals;
    }
}
