package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Sender sender = new Sender();
        interactWithCustomer(sc,sender);
    }

    public static String interactWithCustomer(Scanner sc,Sender sender) {
        System.out.println("How would you like to send email?" + System.lineSeparator() + "please type"
                + System.lineSeparator() +"DHL" +
                System.lineSeparator() + "Email"+System.lineSeparator() + "Pigeon");
        String answer = sc.next();
        switch (answer) {
            case "DHL":
                sender.send(new DHL());
                return sender.test(new DHL());
            case "Email":
                sender.send(new Email());
                return sender.test(new Email());
            case "Pigeon":
                sender.send(new Pigeon());
                return sender.test(new Pigeon());
            default:
                System.out.println("There is no such a way to send this mail");
                return "There is no such a way to send this mail";
        }
    }
}
