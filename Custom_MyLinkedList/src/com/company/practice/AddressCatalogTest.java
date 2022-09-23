package com.company.practice;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AddressCatalogTest {

    @Test
    void getAddressesNormalCase() {
        Person person1 = new Person("Alex",new Address("7th avenu",14));
        Person person2 = new Person("Jack",new Address("collar street",7));
        Person person3 = new Person("Trinity",new Address("wunkl alle",14));

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Address[] expected = {person1.getAddress(),person2.getAddress(),person3.getAddress()};
        Assertions.assertArrayEquals(expected,AddressCatalog.getListOfAddresses(personList).toArray());
    }

    @Test
    void getAddressesIfNull() {
        List<Person> personList = new ArrayList<>();

        Address[] expected = {};
        Assertions.assertArrayEquals(expected,AddressCatalog.getListOfAddresses(personList).toArray());
    }

}