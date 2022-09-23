package com.company;

import com.company.bankservice.AccountNumberCheck;
import com.company.bankservice.FundsCheck;
import com.company.bankservice.SecurityCodeCheck;
import com.company.entity.Account;
import com.company.entity.CardHolder;
import com.company.repository.DataBase;

public class BankAPI {
    private Account account = new Account(new CardHolder("Alex","Turner"),
            "2121","895",7000);
    private DataBase db = new DataBase();

    private AccountNumberCheck accountNumberCheck = new AccountNumberCheck(account,db);
    private FundsCheck fundsCheck = new FundsCheck(account,db);
    private SecurityCodeCheck securityCodeCheck = new SecurityCodeCheck(account,db);


    public void withDraw () {
        if (accountNumberCheck.checkAccountNumber()
                && securityCodeCheck.checkSecurityCode()
                && fundsCheck.checkFunds()) {
            fundsCheck.decreaseBalance();
        } else {
            System.out.println("ERROR");

        }
    }

}
