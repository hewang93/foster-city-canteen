package com.visa.ncg.canteen;

public class DepositInvalidAmountException extends RuntimeException{
    public DepositInvalidAmountException(){ super(); }

    public DepositInvalidAmountException(String message) {
        super(message);
    }
}
