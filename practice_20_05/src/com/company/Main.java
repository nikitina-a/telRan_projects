package com.company;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Integer> list = List.of(3, 2, 1, 0, 5);
        List<Integer> list2 = List.of(3, 2, 1, 4, 5, 1, 0);
        List<Integer> list3 = List.of(3, 2, 1, 4, 5, 9, 0);
        System.out.println(findIndex(list));

        List<Integer> arrivals = List.of(7,8,12,13);
        List<Integer> depart = List.of(13,16,14,17);
        System.out.println(minPlatforms(arrivals,depart));

    }

    public static int findIndex(List<Integer> list) {
        ListIterator<Integer> forward = list.listIterator();
        ListIterator<Integer> backward = list.listIterator(list.size());
        int sumForward = 0;
        int sumBackward = 0;
        int index = 0;

        while (index <= list.size() / 2 && (forward.hasNext() || backward.hasPrevious())) {
            sumForward += forward.next();
            sumBackward += backward.previous();
            index = forward.nextIndex();
            if (sumForward == sumBackward) {
                return index;
            }

        }
        return -1;
    }

    //2.Найти минимальное количество платформ, требующихся для приема поездов на жд станции.
    //Дано время прибытия и отправки поездов .  List arrivals упорядочен
    public static int minPlatforms(List<Integer> arrivals, List<Integer> departures) {
        Stack<Integer> stack = new Stack<>();
        int platform = 1;
        if (arrivals.get(1)<departures.get(0)) {
            platform++;
        }
        int index = platform;
        stack.push(departures.get(0));
        for (int i = 1; i < platform; i++) {
            if (departures.get(i)<stack.peek()){
                stack.push(departures.get(i));
            }
        }
        for (int i = index; i < arrivals.size(); i++) {
            if(arrivals.get(i) < stack.peek()){
                platform++;
            }
            if (departures.get(i)<stack.peek()){
                stack.push(departures.get(i));
            }



        }
        return platform;

    }
}
