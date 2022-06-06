package com.keyin.account;


import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class AccountTest {

    @Test
    public void testCredit() {
        Account accountUnderTest = new Account();

        Assertions.assertEquals(0, accountUnderTest.getBalance());

        Assertions.assertEquals(1000, accountUnderTest.credit(1000));

        Assertions.assertEquals(1000, accountUnderTest.getBalance());

    }

    @Test
    public void testDebit() {
        Account accountUnderTest = new Account();

        Assertions.assertEquals(0, accountUnderTest.getBalance());

        Assertions.assertEquals(1000, accountUnderTest.credit(1000));

        Assertions.assertEquals(1000, accountUnderTest.getBalance());

        try {
            Assertions.assertEquals(900, accountUnderTest.debit(100));
        } catch (com.keyin.account.AccountBalanceException e) {
            System.out.println(e.getMessage());
        }

        Assertions.assertEquals(900, accountUnderTest.getBalance());

        try {
            accountUnderTest.debit(1000);
        } catch (com.keyin.account.AccountBalanceException e) {
            System.out.println(e.getMessage());
        }

        Assertions.assertEquals(900, accountUnderTest.getBalance());
    }

    @Test
    public void testCancel() {
        Account accountUnderTest = new Account();

        Assertions.assertTrue(accountUnderTest.isActive());

        accountUnderTest.cancel();

        Assertions.assertFalse(accountUnderTest.isActive());

    }

}
