package com.company.practice;

import java.util.List;
import java.util.Stack;

public class Task7 {
    //7. написать метод, возвращающий строку, которая встречается  в листе раньше: самую короткую
    // или самую длинную. Если несколько строчек самые короткие или длинные, вернуть первую встретившуюся.
    // лист не пустой ( по желанию, можно также и пустой , но в этом случае надо бросить exception :))

    public static String findShortest(List<String> list) {
        if (list.isEmpty()) return null;

        Stack<Integer> minStack = new Stack<>();
        String shortest = "";
        minStack.push(Integer.MAX_VALUE);
        for (String string:list) {
            if (string.length()<minStack.peek()) {
                minStack.push(string.length());
                shortest = string;
            }


        }
      return shortest;
    }

}
