


package com.keyin.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountManagerTest {

    @Test
    public void testGetAccount() {
        AccountManager accountManagerUnderTest = new AccountManager();

        Account accountFound = accountManagerUnderTest.getAccount("Jamie");

//        System.out.println(accountFound.getName());

        Assertions.assertNull(accountFound);

        accountFound = accountManagerUnderTest.getAccount("Test");

        Assertions.assertNotNull(accountFound);
    }
}