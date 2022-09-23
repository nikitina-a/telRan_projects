package com.company;

public class Pigeon implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Pigeon?! In the twenty-first century, really?!!! You are crazy! I'm flying away");
    }

    public String forTest () {
        return "Send by internet";
    }
}
