package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

    }


    //В ресторан периодически попадает заказ. У заказа есть время, когда он был
    // сделан (milliseconds from 1970 1 Jan).  Для каждого заказа необходтмо
    // установить количество заказов, сделанных за 15 (20,N) минут до него
    /**
     * @param orderTimes -  массив отсортированных по времени моментов, когда происходили заказы
     ** @param minutes
     ** @return для соответствующего заказа. количество заказов, сделанных в предыдущие minutes минут
     ** public int[] countOrderNumber(long[]orderTimes,int minutes)
     **/


    public int[] countOrderNumber(long[]orderTimes, int minutes) {
        int[] res = new int[orderTimes.length];
        Deque<Long> queue = new ArrayDeque<>();
        long millis = minutes * 60000L;

        int i = 0;
        for (long orderTime : orderTimes) {
            queue.addLast(orderTime);
            while (orderTime - queue.getFirst() > millis)
                queue.removeFirst();

            res[i++] = queue.size() - 1;
        }

        return res;

    }

    //написать метод, принимающий строку, содержащую слова разделенные пробелом и два
// функциональных интерфейса  function and predicate. Метод должен предоставлять воз
//можность реализации следующих действий:
// при длине слова 3 изменить все буквы этого слова на строчные и вернуть измененную строку
// при длине слова 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
// при длине слова 4 изменить все буквы этого слова на строчные и вернуть измененную строку
// при длине слова 4 изменить все буквы этого слова на заглавные и вернуть измененную строку
// при длине слова 5 изменить все буквы этого слова на звездочки и вернуть измененную строку
    //       (т.е.написать лямбду для каждого случая )

    public static String transform(String input, Predicate<String> predicate, Function<String,String> function) {
        String[] stringArr = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word:stringArr) {
            if (predicate.test(word)) {
                sb.append(function.apply(word)).append(" ");

            } else {
                sb.append(word).append(" ");
            }

        }
        return sb.toString().trim();
    }


}
