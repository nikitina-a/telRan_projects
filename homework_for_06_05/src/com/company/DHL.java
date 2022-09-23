package com.company;

public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Put a letter in an envelope, put a stamp, send");

    }

    public String forTest () {
        return "Put a letter in an envelope, put a stamp, send";
    }
}
