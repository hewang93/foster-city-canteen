package com.visa.ncg.canteen;

public class Account {
  private int balance;

  public Account(int initialAmount) {
    balance = initialAmount;
  }

  public Account() {
    balance = 0;
  }

  public int balance() {
    return balance;
  }

  public void deposit(int amount) {
    balance += amount;
  }
}
