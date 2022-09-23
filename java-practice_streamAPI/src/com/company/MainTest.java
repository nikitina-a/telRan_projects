package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {

    @Test
    void testFirstTask() {

    }


    @Test
    void testSecondTask() {

    }

    @Test
    void test3thTask() {

    }

    @Test
    void test4thTask() {

    }

    @Test
    void test5thTask() {
        BankAccount bankAccount = new BankAccount("DE8998766543",new Customer("Alex"));
        BankAccount bankAccount1 = new BankAccount("DE8998766543",new Customer("Alex"));
        BankAccount bankAccount2 = new BankAccount("DE8998766543",new Customer("Alex"));

        List<String> expected = List.of("DE8*********","DE8*********","DE8*********");

        Assertions.assertEquals(expected,Main.listOfAccountsWithStars(List.of(bankAccount,bankAccount1,bankAccount2)));

    }

    @Test
    void test6thTask() {
        String input = "I love learning java";
        Assertions.assertEquals(2,Main.numberOfWords(input,"l"));

    }

}