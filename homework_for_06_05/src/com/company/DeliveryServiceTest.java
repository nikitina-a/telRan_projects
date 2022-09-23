package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryServiceTest {
    Scanner sc;
    Sender sender;

    @BeforeEach
    void init() {
        this.sc = new Scanner(System.in);
        this.sender = new Sender();

    }

    @Test
    void testIfServiceIsDHL(){
        String expected = "Put a letter in an envelope, put a stamp, send";
        Assertions.assertEquals(expected,Main.interactWithCustomer(sc,sender));

    }

}