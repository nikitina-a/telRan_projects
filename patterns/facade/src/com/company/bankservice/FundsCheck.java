package com.company.bankservice;

import com.company.entity.Account;
import com.company.repository.DataBase;

public class FundsCheck {
    private Account account;
    private DataBase db;


    public FundsCheck(Account account,DataBase db) {
        this.db = db;
        this.account = account;
    }

    public boolean checkFunds(){
        return account.getBalance()>=50;
    }

    public void decreaseBalance() {
        account.setBalance(account.getBalance() - 50);

    }

    public void increaseBalance() {
        account.setBalance(account.getBalance() + 50);

    }
}
