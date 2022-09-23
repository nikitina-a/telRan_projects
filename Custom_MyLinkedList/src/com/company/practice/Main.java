package com.company.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //3.Есть два листа одинковой длины с числами. Написать метод, который вернет лист с элементами Yes or No
//где значение на i-ом месте зависит от того, равны ли элемениы двух спсиков под номером i
// {1,2,3,4} and {5,2,3,0}->{No,Yes,Yes,No}

//4.Написать метод, реверсирующий лист целых чисел. возвращает его в обратном порядке. Можно решать любым
// способом, какой вам нравится.
        Person person1 = new Person("Alex",new Address("7th avenu",14));
        Person person2 = new Person("Jack",new Address("collar street",7));
        Person person3 = new Person("Trinity",new Address("wunkl alle",14));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(AddressCatalog.getListOfAddresses(personList));
    }
}
