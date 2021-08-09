package com.thoughtworks.tddintro.exercises.accountbalance;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.getBalance(), is(100));
    }


    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(150);
        assertThat(account.getBalance(), is(100));
    }
}

