package com.company;

public class BankAccount {
    int id;
    private double balance;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if (this.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -= amount;
    }


}
