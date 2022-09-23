package com.company.bankservice;

import com.company.entity.Account;
import com.company.repository.DataBase;

public class AccountNumberCheck {
    private Account account;
    private DataBase db;


    public AccountNumberCheck(Account account,DataBase db) {
        this.db = db;
        this.account = account;
    }

    public boolean checkAccountNumber(){
        return db.getAccountNumber(account);
    }
}
