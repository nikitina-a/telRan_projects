package com.company;

public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Send by internet");
    }

    public String forTest () {
        return "Send by internet";
    }


}
