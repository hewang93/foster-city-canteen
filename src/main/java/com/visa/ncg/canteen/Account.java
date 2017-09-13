package com.visa.ncg.canteen;

public class Account {
  private int balance;
  long id;

  public long getID(){
    return id;
  }

  public void setId(long newID){
    id = newID;
  }

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
    if (amount <= 0){
      throw new NegativeDepositException();
    }

    balance += amount;
  }

  public void withdraw(int amount) {
    if (amount > balance) {
      throw new InsufficientBalanceException();
    }
    if (amount <= 0){
      throw new NegativeWithdrawException();
    }
    balance -= amount;
  }
}
