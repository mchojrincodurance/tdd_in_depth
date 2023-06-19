package com.codurance.atm.account;

public class Account {
    private String accountNumber;
    private Integer balance;

    public Account(String accountNumber, Integer balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String accountNumber() {
        return accountNumber;
    }

    public String balance() {
        return balance.toString();
    }
}
