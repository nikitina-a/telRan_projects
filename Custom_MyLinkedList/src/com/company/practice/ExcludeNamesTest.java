package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcludeNamesTest {


    @Test
    void excludeNamesTest() {
        Person person1 = new Person("Alex",new Address("7th avenu",14));
        Person person2 = new Person("Jack",new Address("collar street",7));
        Person person3 = new Person("Trinity",new Address("wunkl alle",14));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Person[] expected = {person3};

        Assertions.assertArrayEquals(expected,ExcludeNames.excludeNames(personList).toArray());
    }

}