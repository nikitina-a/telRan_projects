package com.company.practice;

import java.util.List;
import java.util.stream.Collectors;

public class ExcludeNames {

    public static List<Person> excludeNames(List<Person> personList) {
        return personList.stream().filter(person -> person.getName().length()!=4).collect(Collectors.toList());
    }
}
