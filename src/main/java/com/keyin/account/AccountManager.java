package com.keyin.account;

public class AccountManager {
    public Account getAccount(String name) {
        if ( findAccountByName(name).getName().equals(name)) {
            return findAccountByName(name);
        }

        return null;
    }

    private Account findAccountByName(String name) {
        Account account = new Account();
        account.setName("Test");
        return account;

    }
}
