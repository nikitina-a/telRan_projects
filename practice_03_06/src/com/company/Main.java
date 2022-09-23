package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            validate(17);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        }
    }

    //4. Написать метод "validate"  который принимает возраст человека и бросает "InvalidAgeException"
    // если возраст меньше 18 а в противном случае выводит на экран надпись "welcome to vote"


    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less then 18");
        }

        System.out.println("hey you");;

    }

    //написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
    // 1,5, -10,1-> 1
    public static int findMaxOccuredElt(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : numbers) {

            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }

        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    //написать метод, возвращающий элемент из списка не имеющий пары
    //public int findSingleNumber(List<Integer>numbers)
    // 1,2,1->2,  1,1,1->1
    public static int findSingleNumber(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : numbers) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num,1);
            }


        }
        boolean found = false;
        int single = 0;
        for (Map.Entry entrySet: map.entrySet()) {
            if (entrySet.getValue().equals(1)){
                found = true;
                single = (int) entrySet.getKey();
                break;
            } else {
                found = true;
                single = (int) entrySet.getKey();
            }

        }
        if (found) return single;

      return -1;
    }

    //3. Написать метод, который принимает список имен и их анаграмм и имя по
    // которому он выдает список всех его анаграмм, включая само имя
    //  public List<String>anagramList(String str, List<String>strings)
    //{"ivan","airam","vani","vian","maria","kolya"}, ivan -> {ivan,vani,vian}

    public static List<String> anagramList(String str, List<String>strings) {

        Map<String,List<String>> map = new HashMap<>();
        for (String name: strings) {
            if (name.equals(str)) {
                map.put(name,new ArrayList<>());
                map.get(str).add(name);
            }
            if (isAnagram(str,name) && !name.equals(str)) {
                map.get(str).add(name);
            }


        }
        return map.get(str);

    }

    static boolean  isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

}
