package com.keyin.account;

import java.util.ArrayList;

public class Account {
    private int balance;
    private String name;
    private boolean active;

    private ArrayList<Object> list = new ArrayList<Object>();

    public Account() {
        this.active = true;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Object> getList() {
        return list;
    }

    public void setList(ArrayList<Object> list) {
        this.list = list;
    }

    public boolean isActive() {
        return balance >= 0 && active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void cancel() {
        this.active = false;
    }

    public int credit(int amountToCredit) {
        balance += amountToCredit;
        return balance;
    }

    public int debit(int amountToDebit) throws com.keyin.account.AccountBalanceException {
        if (0 > (balance - amountToDebit)) {
            throw new com.keyin.account.AccountBalanceException("Amount to debit causes negative balance!!  Transaction canceled!");
        }

        balance -= amountToDebit;
        return balance;
    }
}}
