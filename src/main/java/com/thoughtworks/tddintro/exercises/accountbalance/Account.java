package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (validWithdrawal(amount)) {
            balance -= amount;
        }
    }

    public boolean validWithdrawal(int amount) {
        if (balance - amount < 0) {
            return false;
        } else {
            return true;
        }
    }
}
