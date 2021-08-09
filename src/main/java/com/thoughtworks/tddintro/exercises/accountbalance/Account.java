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
        if (balance - amount < 0) {
            System.out.println("You don't have enough!");
        } else {
            balance -= amount;
        }
    }
}
