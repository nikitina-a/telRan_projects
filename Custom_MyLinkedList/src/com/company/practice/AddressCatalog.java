package com.company.practice;

import java.util.ArrayList;
import java.util.List;

public class AddressCatalog {

    public static List<Address> getListOfAddresses(List<Person> personList) {
        if (personList.isEmpty()) return new ArrayList<>();
        List<Address> addressList = new ArrayList<>();
        personList.forEach(person -> addressList.add(person.getAddress()));
        return addressList;

    }
}
