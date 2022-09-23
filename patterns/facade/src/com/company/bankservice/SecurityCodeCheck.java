package com.company.bankservice;

import com.company.entity.Account;
import com.company.repository.DataBase;

public class SecurityCodeCheck {
    private Account account;
    private DataBase db;

    public SecurityCodeCheck(Account account, DataBase db) {
        this.account = account;
        this.db = db;
    }

    public boolean checkSecurityCode(){
        return db.getSecurityCode(account);
    }
}
