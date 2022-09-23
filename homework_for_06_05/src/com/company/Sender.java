package com.company;

public class Sender {
    public  void send(MailDeliveryService mailDeliveryService){
        mailDeliveryService.sendMail();
    }

    public String test(MailDeliveryService mailDeliveryService){

        return mailDeliveryService.forTest();
    }
}
