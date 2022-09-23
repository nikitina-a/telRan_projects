package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       // есть класс автомобиль, в котором есть три поля: марка, модель,цена.
        // Написать метод, который принимает лист автомобилей, а возвращает Treemap,
        // ключами которого являются марки автомобилей а значениями будут TreeSet
        // автомобилей в котором автомобили расположены в лексикографическом порядке
        // относительно модели, причем дешевые вперед если модели одинаковые
        // auto1 -> Volvo, c60, 50000
        // auto2 -> Mercedes, bmers600, 60000
        // auto3 -> Mercedes, amers600, 40000
        // auto4 -> Volvo, c60, 10000
        //Mercedes - [auto3,auto2]
        //Volvo - [auto4,auto1]
        Car car1 = new Car("Volvo","c60",50000);
        Car car2 = new Car("Mercedes","bmers600",60000);
        Car car3 = new Car("Mercedes","amers600",40000);
        Car car4 = new Car("Volvo","c60",10000);

        List<Car> cars = Arrays.asList(car1,car2,car3,car4);
        TreeMap<String, TreeSet<Car>> treeMap = new TreeMap<>();
        treeMap.put("Mercedes",new TreeSet<>(new ComparatorByModel()));
        treeMap.get("Mercedes").add(car3);
        treeMap.get("Mercedes").add(car2);
        treeMap.put("Volvo",new TreeSet<>(new ComparatorByModel()));
        treeMap.get("Volvo").add(car4);
        treeMap.get("Volvo").add(car1);

        System.out.println(getTreeMapOfCars(cars));
        System.out.println(treeMap);

    }
    public static Map<String, TreeSet<Car>> getTreeMapOfCars(List<Car> cars) {
        TreeMap<String,TreeSet<Car>> treeMap = new TreeMap<>();

        for (Car car: cars) {
            if (!treeMap.containsKey(car.getBrand())) {
                treeMap.put(car.getBrand(), new TreeSet<>(new ComparatorByModel()));
                treeMap.get(car.getBrand()).add(car);
            } else {
                treeMap.get(car.getBrand()).add(car);
            }

        }
        return treeMap;
    }

    // написать метод, принимающий лист слов,начинающихся с маленькой буквы ,
    // а возвращающий Treemap, ключами которого являются
    // буквы а значениями - листы слов, начинающихся с данной буквы и расположенных
    // в лексикографи-
    //ческом порядке.
    //{hello,world,hell}-> {h:[hell,hello], w:[world]}

    public static Map<Character,List<String>> getTreeMapOfWords(List<String> words) {
        Map<Character,List<String>> treeMap = new TreeMap<>();

        for (String word:words) {
            Character firstChar = word.charAt(0);
            if (!treeMap.containsKey(firstChar)) {
                treeMap.put(firstChar,new ArrayList<>());
                treeMap.get(firstChar).add(word);
            } else {
                treeMap.get(firstChar).add(word);
            }

        }
        return treeMap;

    }

}
