package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    // 1.есть Класс Address с полями street and houseNumber и класс Person c полями name, age
    // and Address. Написать метод, возвращающий адреса тех кто старше 17 лет
    // List<Address> addrMoreThanSeventeen(List<Person>input)
    public static List<Address> addrMoreThanSeventeen(List<Person> input) {
        return input.stream()
                .filter(person->person.getAge() > 17)
                .map(Person::getAddress)
                .toList();
    }

    // 2. Написать метод, возвращающий список имен без дупликатов двумя способами:
    //в Set и в Listе
    public static List<String> getUniqueNames (List<String> names) {
        return new HashSet<>(names)
                .stream()
                .toList();
    }

    public static List<String> getUniqueNamesUsingList (List<String> names) {
        return names.stream()
                .distinct()
                .toList();
    }

    //3. Есть лист Persons из первой задачи. Написать метод, возвращающий map, где возраст это ключ а список персонов
    // значение

    public static Map<Integer,List<Person>> getMap (List<Person> personList) {
         return personList.stream()
                          .collect(Collectors.groupingBy(Person::getAge));
    }

    //4. Есть класс Customer  с полем имя и класс BankAccount c полями IBAN and Customer.
    // Написать метод, возвращающий мапу где customer это ключ, а список его счетов value
    //public static Map<Customer,List<BankAccount>mapAccountsByCustomer(List <BankAccount>input)
    // Ivanov=[Account{IBAN="DE123455",owner=Ivanov, BankAccount{IBAN="DE456767_owner=Ivamov], Sidorov
    public static Map<Customer,List<BankAccount>>  mapAccountsByCustomer(List <BankAccount> input) {
        return input.stream()
                .collect(Collectors.groupingBy(BankAccount::getCustomer));

    }

    //5.написать метод, возвращающий список IBANNs из класса BankAccount где после третьего символа стоят звездочки
    // List<String> listOfAccountsWithStars(List<BankAccount>input)

    public static List<String> listOfAccountsWithStars(List<BankAccount>input) {
        return input.stream()
                .map(bankAccount ->
                    bankAccount.getIBAN().substring(0,3).concat(bankAccount.getIBAN().substring(3).replaceAll("[0-9]","*")))
                .toList();

    }



    //6. Метод принимает строку состоящую из слов , разделенных пробелом и букву.
    // Возвращает количество слов, начинающихся с этой буквы
     public static long numberOfWords(String input, String w) {
        return Arrays.stream(input.split(" "))
                .filter(word -> word.startsWith(w))
                .count();
     }








}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class BankAccount {
    private String IBAN;
    private Customer customer;

    public BankAccount(String IBAN, Customer customer) {
        this.IBAN = IBAN;
        this.customer = customer;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Address {
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }


}

class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
