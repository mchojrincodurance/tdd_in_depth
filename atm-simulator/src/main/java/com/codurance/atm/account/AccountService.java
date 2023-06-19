package com.codurance.atm.account;

public class AccountService {
    public Account findBy(String accountNumber, String pin) {
        return new Account(accountNumber, 0);
    }
}
