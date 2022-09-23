package com.company.entity;

public class Account {
    private CardHolder cardHolder;
    private String cardNumber;
    private String securityCode;
    private int balance;

    public Account(CardHolder cardHolder, String cardNumber, String securityCode, int balance) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
                "cardHolder=" + cardHolder +
                ", cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", balance=" + balance +
                '}';
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
