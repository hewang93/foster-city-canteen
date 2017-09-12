package com.visa.ncg.canteen;

public class Account {
  private int balance;
  private long id;

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
    if (amount <= 0) {
      throw new DepositInvalidAmountException();
    }
    balance += amount;
  }

  public void withdraw(int amount) {
    if (amount > balance) {
      throw new InsufficientBalanceException();
    }
    if (amount <= 0) {
      throw new WithdrawInvalidAmountException();
    }
    balance -= amount;
  }
  public void setId(long id) {
    this.id = id;
  }

  public long getId(){
    return id;
  }

}
