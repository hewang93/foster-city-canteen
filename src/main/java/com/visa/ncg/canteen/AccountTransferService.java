package com.visa.ncg.canteen;

public class AccountTransferService {
    public void transfer(Account source, Account dest, int amount){
        if (amount <= 0)
        {
            throw new NegativeOrZeroTransferException();
        }
        source.withdraw(amount);
        dest.deposit(amount);
    }
}
